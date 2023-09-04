package com.example.gatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GatewayserverApplication {

    public static void main(String[] args) {

        new SpringApplicationBuilder()
                .profiles("dev")
                .sources(GatewayserverApplication.class)
                .run(args);
    }

}
