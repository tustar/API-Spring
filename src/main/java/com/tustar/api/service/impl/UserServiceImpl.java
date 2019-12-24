package com.tustar.api.service.impl;


import com.tustar.api.entity.User;
import com.tustar.api.mapper.UserMapper;
import com.tustar.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> findAll() {
        return userMapper.findAll();
    }
}
