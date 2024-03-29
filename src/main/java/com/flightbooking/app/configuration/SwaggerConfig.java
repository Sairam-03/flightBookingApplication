package com.flightbooking.app.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

    @Bean
    public Docket userApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("~Users")
                .select()
                .paths(PathSelectors.ant("/api/v1.0/flight/**"))
                .build()
                .apiInfo(getApiInfo());
    }

    @Bean
    public Docket adminApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("~Admin")
                .select()
                .paths(PathSelectors.ant("/api/v1.0/admin/**"))
                .build()
                .apiInfo(getApiInfo());
    }

    private ApiInfo getApiInfo() {
        ApiInfo apiInfo = new ApiInfo("Flight Booking Application",
                "Demonstration of Journey to Mars Flights", "1.0", null,
                new Contact("Sai ram", "https://saifolio.herokuapp.com/", "sai@gmail.com"),
                null, null);
        return apiInfo;
    }
}
