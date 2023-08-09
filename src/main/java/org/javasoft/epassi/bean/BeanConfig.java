package org.javasoft.epassi.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@Configuration
public class BeanConfig {

    @Bean
    public RestTemplateBean restTemplateBean(RestTemplateBuilder restTemplateBuilder , ErgastConfig ergastConfig){
        RestTemplate restTemplate = restTemplateBuilder
                .setConnectTimeout(Duration.ofMillis(5000))
                .setReadTimeout(Duration.ofMillis(5000))
                .build();
        RestTemplateBean restTemplateBean = new RestTemplateBean();
        restTemplateBean.setRestTemplate(restTemplate);
        restTemplateBean.setBaseUrl(ergastConfig.getUrl());
        restTemplateBean.setErgastConfig(ergastConfig);
        restTemplateBean.setObjectMapper(getObjectMapper());
        return restTemplateBean;
    }

    private ObjectMapper getObjectMapper(){
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        return objectMapper;
    }

}
