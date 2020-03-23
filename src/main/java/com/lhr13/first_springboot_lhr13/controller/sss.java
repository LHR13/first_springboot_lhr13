package com.lhr13.first_springboot_lhr13.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class sss {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(10);
        System.out.println(encoder.encode("123"));
    }
}

