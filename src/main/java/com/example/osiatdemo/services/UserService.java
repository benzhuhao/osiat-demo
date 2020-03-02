package com.example.osiatdemo.services;


import com.example.osiatdemo.model.User;
import com.example.osiatdemo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    private User createUser(User user) {
        return userRepo.save(user);
    }

    public User getUserById(String id) {
        return userRepo.findById(Integer.valueOf(id)).orElse(null);
    }

    public User updateUserById(User user) {
        return userRepo.save(user);
    }

    public boolean deleteUserById(String userId) {
        userRepo.deleteById(Integer.valueOf(userId));
    }
}
