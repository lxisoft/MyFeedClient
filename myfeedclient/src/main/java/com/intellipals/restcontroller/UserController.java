package com.intellipals.restcontroller;

import com.intellipals.model.User;
import com.intellipals.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/signup")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/userRegister")
    public String userRegister(@RequestBody User user) {
        userService.signupUser(user);
        return "User registered successfully";
    }
}
