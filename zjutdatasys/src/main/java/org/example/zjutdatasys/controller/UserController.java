package org.example.zjutdatasys.controller;

import jakarta.annotation.Resource;
import org.example.zjutdatasys.pojo.Result;
import org.example.zjutdatasys.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
    @PostMapping("/login")
    public Result login(@RequestBody String username, String password) {
        return userService.login(username, password);
    }
}
