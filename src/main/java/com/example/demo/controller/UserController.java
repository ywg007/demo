package com.example.demo.controller;

import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    //这是一个。。。

    @PostMapping("/add")
    public int add(User user) {
        return userService.add(user);
    }
    @PostMapping("/delete")
    public int delete(User user){
        return userService.delete(user);
    }
    @PostMapping("/updata")
    public int updata(User user){
        return userService.updata(user);
    }
    @PostMapping("/select")
    public User select(User user){
        return userService.select(user);
    }


}
