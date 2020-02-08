package com.bellacore.springblog.controller;

import com.bellacore.springblog.dto.RegisterRequest;
import com.bellacore.springblog.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/signup")
    public void signup(@RequestBody RegisterRequest registerRequest){
        this.authService.signup(registerRequest);
    }
}
