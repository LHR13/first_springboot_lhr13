package com.lhr13.first_springboot_lhr13.controller;

import com.lhr13.first_springboot_lhr13.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/userById")
    public String GetUserById(Integer id) {
        return userService.getUserById(id);
    }

    @GetMapping("/deleteUser")
    public void DeleteUser(Integer id) {
        userService.deleteUserById(id);
    }
}
