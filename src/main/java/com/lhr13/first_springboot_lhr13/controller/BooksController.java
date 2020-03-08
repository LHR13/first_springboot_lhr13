package com.lhr13.first_springboot_lhr13.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
@CrossOrigin
public class BooksController {

    @PostMapping("/")
    public String addBook(String name) {
        return "receive" + name;
    }

    @DeleteMapping("/{id}")
    public String deleteBookById(@PathVariable Long id) {
        return String.valueOf(id);
    }
}
