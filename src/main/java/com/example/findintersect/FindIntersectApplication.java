package com.example.findintersect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class FindIntersectApplication {

    public static void main(String[] args) {
        System.out.println("hello world");
        SpringApplication.run(FindIntersectApplication.class, args);
    }

}
