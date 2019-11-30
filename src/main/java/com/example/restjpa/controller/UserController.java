package com.example.restjpa.controller;

import com.example.restjpa.model.User;
import com.example.restjpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @author Gaurav Rajput
 * Created on 26/11/19
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") int id) {
        Optional<User> op =  userRepository.findById(id);
        return op.get();
    }

    @PostMapping("/add")
    public User addUser(@RequestBody User user) {
        userRepository.save(user);
        return user;
    }
}
