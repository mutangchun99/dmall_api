package com.djg.dmall_api.service;

import com.djg.dmall_api.dao.UserDao;
import com.djg.dmall_api.mapper.UserMapper;
import com.djg.dmall_api.po.User;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDao {

    final
    UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User selectByMobileUser(String mobile) {
        return userMapper.selectByMobileUser(mobile);
    }

    @Override
    public User selectByIdUser(String id) {
        return userMapper.selectByIdUser(id);
    }
}
