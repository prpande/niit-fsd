package com.bej.SpringCloudAPIGateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class APIGatewayConfiguration {

    @Bean
    public RouteLocator setupRoutes(RouteLocatorBuilder builder){
        return builder.routes()
                .route(predicateSpec -> predicateSpec
                        .path("/api/v1/**")
                        .uri("http://localhost:8083/"))

                .route(predicateSpec -> predicateSpec
                        .path("/api/v2/**")
                        .uri("http://localhost:8087/"))
                .build();
    }
}
