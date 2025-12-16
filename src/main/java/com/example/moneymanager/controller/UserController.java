package com.example.moneymanager.controller;

import com.example.moneymanager.entity.User;
import com.example.moneymanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<User> getAllUser()
    {
        return userService.getAllUser();
    }

    @GetMapping("/{id}")
    public User getUserbyId(@PathVariable Long id ) {
        System.out.println("Object "+userService.getUser(id));
        return userService.getUser(id);
    }
    @PostMapping("/addInfo")
    public void addUserInfo(@RequestBody List<User> userBody)
    {
        userService.addUser(userBody);
    }
}
