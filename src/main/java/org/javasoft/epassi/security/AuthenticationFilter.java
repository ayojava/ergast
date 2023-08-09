package org.javasoft.epassi.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.apache.commons.lang3.StringUtils;
import org.javasoft.epassi.exception.ErgastException;
import org.javasoft.epassi.exception.ErrorResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Slf4j
public class AuthenticationFilter extends GenericFilterBean {

    public static final String AUTH_TOKEN_HEADER = "X-API-TOKEN";

    public static final String AUTH_TOKEN_VALUE = "EPASSI";

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        val httpServletRequest = (HttpServletRequest) servletRequest;
        val httpServletResponse = (HttpServletResponse) servletResponse;

        try{
            Authentication authentication = handleAuthentication(httpServletRequest);
            SecurityContextHolder.getContext().setAuthentication(authentication);
            filterChain.doFilter(httpServletRequest,httpServletResponse);
        } catch (Exception ex){
            log.error(" Exception => " +ex.getMessage());
            ErrorResponse errorResponse = new ErrorResponse("Error Occurred during authentication", String.valueOf(HttpServletResponse.SC_UNAUTHORIZED));
            httpServletResponse.addHeader("Content-Type", "application/json");
            httpServletResponse.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            PrintWriter printWriter = httpServletResponse.getWriter();
            printWriter.print(OBJECT_MAPPER.writeValueAsString(errorResponse));
            printWriter.flush();
            printWriter.close();
        }
    }

    private Authentication handleAuthentication(HttpServletRequest httpServletRequest){
        val token = httpServletRequest.getHeader(AUTH_TOKEN_HEADER);
        if (!StringUtils.equals(token,AUTH_TOKEN_VALUE)){
            throw new ErgastException("Invalid API Key");
        }
        return new AuthenticationToken(token, AuthorityUtils.NO_AUTHORITIES);
    }
}
