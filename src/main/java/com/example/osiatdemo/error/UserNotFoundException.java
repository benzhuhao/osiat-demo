package com.example.osiatdemo.error;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String id){
        super(String.format("User id: %s is not found", id));
    }
}
