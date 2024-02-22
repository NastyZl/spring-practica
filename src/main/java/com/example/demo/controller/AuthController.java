package com.example.demo.controller;

import com.example.demo.dto.AuthRequest;
import com.example.demo.entity.UserInfo;
import com.example.demo.service.UserService;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/auth")
public class AuthController {
    private UserService userService;
    private AuthenticationManager authenticationManager;

    public AuthController(UserService userService, AuthenticationManager authenticationManager) {
        this.userService = userService;
        this.authenticationManager = authenticationManager;
    }

    @PostMapping("/new")
    public String addUser(@RequestBody UserInfo userInfo) {
        return userService.addUser(userInfo);
    }

//    @PostMapping("/authenticate")
//    public String authenticateAndGetToken(@RequestBody AuthRequest request) {
//        Authentication authentication = authenticationManager.authenticate();
//    }

}
