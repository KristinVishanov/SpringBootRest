package com.spring.boot.rest.example.demo.service;

import com.spring.boot.rest.example.demo.entity.User;
import org.springframework.stereotype.Service;

public interface UserService {
    void createUser(User user);
}
