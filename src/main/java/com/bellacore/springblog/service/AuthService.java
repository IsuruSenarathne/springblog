package com.bellacore.springblog.service;

import com.bellacore.springblog.dto.RegisterRequest;
import com.bellacore.springblog.model.User;
import com.bellacore.springblog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AuthService {
    @Autowired
    private UserRepository userRepository;

    public void signup(RegisterRequest registerRequest){
        User user = new User();
        user.setUsername(registerRequest.getUsername());
        user.setEmail(registerRequest.getEmail());
        user.setPassword(registerRequest.getPassword());
        this.userRepository.save(user);
    }
}
