package org.example.zjutdatasys.service;

import org.example.zjutdatasys.pojo.Result;
import org.springframework.stereotype.Component;

@Component
public interface UserService {
    Result login(String id , String password);
}
