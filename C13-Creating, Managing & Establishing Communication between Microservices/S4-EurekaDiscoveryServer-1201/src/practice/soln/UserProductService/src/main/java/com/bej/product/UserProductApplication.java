package com.bej.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserProductApplication.class, args);
    }
}
