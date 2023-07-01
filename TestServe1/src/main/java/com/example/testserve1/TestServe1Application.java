package com.example.testserve1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TestServe1Application {

    public static void main(String[] args) {
        SpringApplication.run(TestServe1Application.class, args);
    }

}
