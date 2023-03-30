package com.djg.dmall_api.controller;

import com.djg.dmall_api.service.UserService;
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
    public String login(@RequestParam("username") String username,@RequestParam("password") String password) {
        return userService.login(username, password);
    }

}
