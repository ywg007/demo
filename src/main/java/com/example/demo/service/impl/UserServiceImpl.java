package com.example.demo.service.impl;

import com.example.demo.dao.UserMapper;
import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public int add(User user) {
        return userMapper.insert(user);
    }
//       tgg
    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int delete(User user) {
        return userMapper.deleteByPrimaryKey(user.getUserId());
    }

    @Override
    public int updata(User user) {
        return userMapper.updateByPrimaryKey(user);
    }

    @Override
    public User select(User user) {
        return userMapper.selectByPrimaryKey(user.getUserId());
    }


}
