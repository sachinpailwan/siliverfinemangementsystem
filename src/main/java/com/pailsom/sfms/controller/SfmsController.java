package com.pailsom.sfms.controller;

import com.pailsom.sfms.model.User;
import com.pailsom.sfms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sfms")
public class SfmsController {

    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello";
    }

    @GetMapping("/user")
    public List<User> getUsers(){
        return userService.getUsers();
    }
}
