package com.djg.dmall_api.dao;

import com.djg.dmall_api.po.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    User selectByMobileUser(String mobile);

    User selectByIdUser(String id);
}
