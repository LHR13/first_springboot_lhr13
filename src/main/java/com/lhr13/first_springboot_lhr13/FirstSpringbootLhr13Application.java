package com.lhr13.first_springboot_lhr13;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableCaching
@EnableJms
public class FirstSpringbootLhr13Application {

    public static void main(String[] args) {
        SpringApplication.run(FirstSpringbootLhr13Application.class, args);
    }

}

