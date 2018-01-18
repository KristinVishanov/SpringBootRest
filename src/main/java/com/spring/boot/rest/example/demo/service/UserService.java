package com.spring.boot.rest.example.demo.service;

import com.spring.boot.rest.example.demo.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    void createUser(User user);
    void deleteUserById(Long id);
    User findUserById(long id);
    void updateUserById(User user);
}
