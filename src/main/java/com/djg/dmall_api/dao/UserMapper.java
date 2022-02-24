package com.djg.dmall_api.dao;

import com.djg.dmall_api.po.User;

public interface UserMapper {

    User selectByMobile(String mobile);

    User selectByUserName(String username);
}
