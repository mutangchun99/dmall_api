package com.djg.dmall_api.service;

import com.djg.dmall_api.po.User;


public interface UserService  {

    User selectByMobileUser(String mobile);

    User selectByUsername(String username);

    String login(String username,String password);
}
