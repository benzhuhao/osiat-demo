package com.example.osiatdemo.controller;


import com.example.osiatdemo.model.User;
import com.example.osiatdemo.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(
            value = "/save",
            produces = "application/json",
            consumes = "application/json"
    )
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User createdUser = userService.createUser(user);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

    @GetMapping(
            value = "/getById/{userId}",
            produces = "application/json"
    )
    public ResponseEntity getUserById(@PathVariable( "userId" ) String id) {

        User user = userService.getUserById(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping(
            value = "/getAllUsers",
            produces = "application/json"
    )
    public ResponseEntity getUsers() {

        User[] users = userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @PutMapping(
            value = "/updateUser",
            produces = "application/json",
            consumes = "application/json"
    )
    public ResponseEntity<User> updateUser(@RequestBody User user) {

        User updateUser = userService.updateUser(user);
        return new ResponseEntity<>(updateUser, HttpStatus.OK);
    }

    @DeleteMapping(
            value = "/delete/{userId}"
    )
    public ResponseEntity<Boolean> deleteUser(@PathVariable("userId") String id) {
        boolean isDelete = userService.deleteUserById(id);

        return new ResponseEntity<>(isDelete, HttpStatus.NO_CONTENT);
    }
}
