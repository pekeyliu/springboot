package com.example.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Value("${my.name}")
    private String name;
    @Value("${my.age}")
    private String age;

    @RequestMapping(value = "/userInfo")
    public String findUserInfo(){
        return "My name is " + name + ",and I am " + age + "years old!";
    }
}
