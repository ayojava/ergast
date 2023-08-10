package org.javasoft.epassi.bean;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.javasoft.epassi.exception.ErgastException;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;


@Slf4j
public class RestTemplateBean {

    @Getter @Setter
    private RestTemplate restTemplate;

    @Getter @Setter
    private String baseUrl;

    @Getter @Setter
    private ObjectMapper objectMapper;

    @Setter
    private ErgastConfig ergastConfig;

    @Getter
    private int limit = 0 ;

    public <T> T loadRecords(Class<T> responseType, String path)  {
        int limit = ergastConfig.getLimit();
        return loadRecords(0 , limit , responseType , path);
    }
    public <T> T loadRecords(int offset, int limit, Class<T> responseType, String path)  {
        String fullPath = baseUrl + path;


        String uriString = UriComponentsBuilder.fromHttpUrl(fullPath)
                .queryParam("limit", limit)
                .queryParam("offset", offset)
                .build()
                .toUriString();



        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", "application/json");
        String response = null;
        try {
            HttpEntity<String> responseEntity = restTemplate.exchange(uriString, HttpMethod.GET, new HttpEntity<>(headers), String.class);
            response = responseEntity.getBody();
            if (String.class.equals(responseType)) {
                return (T) response;
            }

            return objectMapper.readValue(response, responseType);
        } catch (JsonProcessingException ex) {
            throw new ErgastException( "Could not parse JSON,", ex);

        }



    }
}
