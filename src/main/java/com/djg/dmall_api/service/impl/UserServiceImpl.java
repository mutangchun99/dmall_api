package com.djg.dmall_api.service.impl;

import com.djg.dmall_api.dao.UserMapper;
import com.djg.dmall_api.po.User;
import com.djg.dmall_api.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    final
    UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User selectByMobileUser(String mobile) {
        return userMapper.selectByMobile(mobile);
    }

    @Override
    public User selectByUsername(String username) {
        return userMapper.selectByUserName(username);
    }

    @Override
    public String login(String username, String password) {
        return null;
    }

}
