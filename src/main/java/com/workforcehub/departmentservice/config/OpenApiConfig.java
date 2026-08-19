package com.workforcehub.departmentservice.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI departmentServiceOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Department Service API")
                        .description("API Documentation for the Workforce Hub Department Service")
                        .version("v1.0.0"));
    }
}
