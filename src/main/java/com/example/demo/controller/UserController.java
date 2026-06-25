package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@RestController
@CrossOrigin("*")
public class UserController {

    @Autowired
    UserRepository repo;


    @PostMapping("/register")
public String register(@RequestBody User user){

    User existingUser = repo.findByUsername(user.getUsername());

    if(existingUser != null){
        return "Username Already Exists";
    }

    repo.save(user);

    return "Account Created";
}

    @PostMapping("/login")
    public String login(@RequestBody User user){

        User dbUser = repo.findByUsername(user.getUsername());

        if(dbUser == null){
            return "User Not Found";
        }

        if(dbUser.getPassword().equals(user.getPassword())){
            return "Login Successful";
        }

        return "Invalid Password";
    }
}