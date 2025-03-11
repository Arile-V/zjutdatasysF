package org.example.zjutdatasys.service.impl;

import org.example.zjutdatasys.pojo.Result;
import org.example.zjutdatasys.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class IUserService implements UserService {
    @Override
    public Result login(String id, String password) {
        return Result.ok();
    }
}
