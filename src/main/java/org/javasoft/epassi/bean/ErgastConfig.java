package org.javasoft.epassi.bean;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;

@Data
@Validated
@Configuration
@ConfigurationProperties(prefix = "ecfg")
public class ErgastConfig {

    private int limit;

    @NotEmpty
    private String url;
}
