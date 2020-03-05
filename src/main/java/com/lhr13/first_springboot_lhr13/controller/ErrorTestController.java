package com.lhr13.first_springboot_lhr13.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorTestController {

    @GetMapping(value = "/aaa")
    public void Error() {
        int i = 1;
        int p = i / 0;
    }
}
