package com.spring.boot.rest.example.demo.controller;

import com.spring.boot.rest.example.demo.entity.User;
import com.spring.boot.rest.example.demo.entity.request.AddUserRequest;
import com.spring.boot.rest.example.demo.repository.UserDao;
import com.spring.boot.rest.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private UserDao userRepository;

    @Autowired
    private UserService userService;

    @Autowired
    public UserController(UserDao userRepository){
        this.userRepository = userRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<User> findAllUsers(){
        return userRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addUser(@RequestBody AddUserRequest addUserRequest){
        User user = new User();
        user.setName(addUserRequest.getName());
        user.setSurname(addUserRequest.getSurname());
        user.setEmail(addUserRequest.getEmail());
        userService.createUser(user);
    }
}
