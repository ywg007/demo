package com.example.demo.service;

import com.example.demo.pojo.User;
import org.springframework.stereotype.Service;


public interface UserService {
    int add(User user);
    int insert(User user);
    int delete(User user);
    int updata(User user);
    User select(User user);

}