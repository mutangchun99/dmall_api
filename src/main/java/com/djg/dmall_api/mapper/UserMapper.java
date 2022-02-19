package com.djg.dmall_api.mapper;

import com.djg.dmall_api.po.User;

public interface UserMapper {

    User selectByMobileUser(String mobile);

    User selectByIdUser(String id);
}
