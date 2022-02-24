package com.djg.dmall_api.controller;

import com.djg.dmall_api.po.User;
import com.djg.dmall_api.service.UserService;
import com.djg.dmall_api.util.JsonWebTokenUtils;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "*")
public class LoginController {

    final
    UserService userService;

    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(String username, String password) {
        return userService.login(username, password);
    }

}
