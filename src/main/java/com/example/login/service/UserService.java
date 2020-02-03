package com.example.login.service;


import com.example.login.model.User;

public interface UserService {

    public User findUserByEmail(String email);

    public void saveUser(User user);
}