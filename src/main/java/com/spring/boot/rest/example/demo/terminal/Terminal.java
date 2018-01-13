package com.spring.boot.rest.example.demo.terminal;

import com.spring.boot.rest.example.demo.entity.User;
import com.spring.boot.rest.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Terminal implements CommandLineRunner {

    @Autowired
    private UserService userService;

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("tst");
//        User user = new User();
//        user.setName("Kris");
//        user.setSurname("Vishanov");
//        userService.createUser(user);
//        User userOne = new User();
//        userOne.setName("Testov");
//        userOne.setSurname("User");
//        userService.createUser(userOne);
    }
}
