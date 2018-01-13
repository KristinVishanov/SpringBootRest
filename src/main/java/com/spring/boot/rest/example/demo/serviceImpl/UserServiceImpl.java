package com.spring.boot.rest.example.demo.serviceImpl;

import com.spring.boot.rest.example.demo.entity.User;
import com.spring.boot.rest.example.demo.repository.UserDao;
import com.spring.boot.rest.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void createUser(User user) {
        userDao.saveAndFlush(user);
    }
}
