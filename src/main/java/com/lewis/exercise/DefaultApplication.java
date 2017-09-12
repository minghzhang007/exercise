package com.lewis.exercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DefaultApplication {

    public static void main(String[] args) {
        SpringApplication.run(DefaultApplication.class,args);
    }
}
