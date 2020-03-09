package com.lhr13.first_springboot_lhr13.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String sayHello(String name) {
        return "hello " + name + " !";
    }
}
