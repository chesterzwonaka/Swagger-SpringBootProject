package com.chestermabulela.swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket postApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("chessmabs")
                .apiInfo(apiInfo())
                .select()
                .paths(regex("/course.*"))
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Course API")
                .description("Chester Mabulela Course API Documentation Generated using Swagger2 for Course Rest API")
                .termsOfServiceUrl("https://www.linkedin.com/in/chester-mabulela-53a3092b4")
                .license("Chester Mabulela Rest API License")
                .licenseUrl("https://github.com/chesterzwonaka?tab=repositories")
                .version("1.0")
                .build();
    }
}
