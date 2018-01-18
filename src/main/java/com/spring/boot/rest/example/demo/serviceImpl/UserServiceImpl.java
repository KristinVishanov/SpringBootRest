package com.spring.boot.rest.example.demo.serviceImpl;

import com.spring.boot.rest.example.demo.entity.User;
import com.spring.boot.rest.example.demo.repository.UserDao;
import com.spring.boot.rest.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public void createUser(User user) {
        userDao.saveAndFlush(user);
    }

    @Override
    public void deleteUserById(Long id) {
        userDao.delete(id);
    }

    @Override
    public User findUserById(long id) {
        return userDao.findOne(id);
    }

    @Override
    public void updateUserById(User user) {
         userDao.save(user);
    }
}
