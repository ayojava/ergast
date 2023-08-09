package org.javasoft.epassi.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Slf4j
@ControllerAdvice
public class GenericExceptionHandler {

    @ExceptionHandler(ErgastException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ErrorResponse sendErrorResponse(ErgastException ergastException){
        return new ErrorResponse(ergastException.getMessage(), "FAILED");
    }

    @ExceptionHandler(MissingServletRequestParameterException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ErrorResponse handleMissingParams(MissingServletRequestParameterException ex) {
        return new ErrorResponse("[ " + ex.getParameterName() + " ]  parameter is missing", "FAILED");
    }

}
