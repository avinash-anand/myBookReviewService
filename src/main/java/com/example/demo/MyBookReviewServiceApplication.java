package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
@RequestMapping("/book-reviews")
public class MyBookReviewServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyBookReviewServiceApplication.class, args);
    }

    @GetMapping("/available")
    public String isAvailable() {
        return "My Book Review Service is available";
    }
    
    @Bean
    public AlwaysSampler alwaysSampler() {
        return new AlwaysSampler();
    }

}
