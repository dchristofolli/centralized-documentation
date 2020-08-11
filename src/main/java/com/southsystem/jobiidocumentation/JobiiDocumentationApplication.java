package com.southsystem.jobiidocumentation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableConfigurationProperties({SwaggerServicesConfig.class, SwaggerServices.class})
public class JobiiDocumentationApplication {
    public static void main(String[] args) {
        SpringApplication.run(JobiiDocumentationApplication.class, args);
    }
}
