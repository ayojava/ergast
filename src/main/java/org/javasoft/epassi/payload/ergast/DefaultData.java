package org.javasoft.epassi.payload.ergast;

import lombok.Data;

@Data
public class DefaultData {

    private String xmlns;

    private String series;

    private String url;

    private String limit;

    private String offset;

    private String total;
}
