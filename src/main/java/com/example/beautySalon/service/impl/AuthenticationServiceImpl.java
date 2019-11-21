package com.example.beautySalon.service.impl;

import com.example.beautySalon.config.UserTokenModel;
import com.example.beautySalon.dto.UserDto;
import com.example.beautySalon.service.AuthenticationService;
import com.example.beautySalon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

    private final UserService userService;

    @Autowired
    public AuthenticationServiceImpl(UserService userService){
        this.userService = userService;
    }

    @Override
    public UserTokenModel login(UserDto userDto) {
        return null;
    }

    @Override
    public UserTokenModel register(UserDto userDto) {
        return null;
    }
}
