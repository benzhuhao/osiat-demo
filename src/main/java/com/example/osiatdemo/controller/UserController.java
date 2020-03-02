package com.example.osiatdemo.controller;


import com.example.osiatdemo.model.User;
import com.example.osiatdemo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/get/{userId}", produces = "application/json")
    public ResponseEntity<User> getUserById(@PathVariable String id) {
        return new User();
    }
}
