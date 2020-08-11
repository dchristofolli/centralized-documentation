package com.southsystem.jobiidocumentation;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.List;

@Primary
@Configuration
@EnableConfigurationProperties(SwaggerServices.class)
@ConfigurationProperties(prefix = "documentation.swagger")
public class SwaggerServicesConfig {

    List<SwaggerServices> swagger;

    public List<SwaggerServices> getServices() {
        return swagger;
    }

    public void setServices(List<SwaggerServices> swaggerResources) {
        this.swagger = swaggerResources;
    }

}