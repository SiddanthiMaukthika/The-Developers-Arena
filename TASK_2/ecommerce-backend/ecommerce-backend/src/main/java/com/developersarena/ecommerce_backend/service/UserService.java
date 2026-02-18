package com.developersarena.ecommerce_backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.developersarena.ecommerce_backend.model.User;
import com.developersarena.ecommerce_backend.repository.UserRepository;

@Service   // VERY IMPORTANT
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
