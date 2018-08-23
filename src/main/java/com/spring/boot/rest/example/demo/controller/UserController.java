package com.spring.boot.rest.example.demo.controller;

import com.spring.boot.rest.example.demo.entity.User;
import com.spring.boot.rest.example.demo.entity.request.UserDto;
import com.spring.boot.rest.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public List<User> findAllUsers(){
        return userService.findAll();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public User getUserById(@PathVariable("id") long id){
        return userService.findUserById(id);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteUserById(@PathVariable("id") Long id){
        userService.deleteUserById(id);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public void updateUser(@RequestBody User user){
        userService.updateUserById(user);
    }

    @RequestMapping(method = RequestMethod.POST)
    public User addUser(@RequestBody UserDto userDto){
        User user = new User();
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setEmail(userDto.getEmail());
        user.setStatus(userDto.getStatus());
        userService.createUser(user);

        return user;
    }
}
