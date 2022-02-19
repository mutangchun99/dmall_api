package com.djg.dmall_api.controller;

import com.djg.dmall_api.po.User;
import com.djg.dmall_api.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    User user;
    final
    UserService userService;

    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        user = userService.selectByIdUser("1");
        return "hello world" + user.getUsername();
    }

}
