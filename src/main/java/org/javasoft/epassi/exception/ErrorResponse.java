package org.javasoft.epassi.exception;


import lombok.Data;

@Data
public class ErrorResponse {

    private final String description;

    private final String status;

}
