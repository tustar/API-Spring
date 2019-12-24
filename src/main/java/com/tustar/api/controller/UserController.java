package com.tustar.api.controller;

import com.tustar.api.entity.User;
import com.tustar.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String info() {
        return "Hello";
    }

    @RequestMapping("/users")
    @ResponseBody
    public List<User> all() {
        return userService.findAll();
    }
}
