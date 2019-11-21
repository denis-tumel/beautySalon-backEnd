package com.example.beautySalon.service;

import com.example.beautySalon.config.UserTokenModel;
import com.example.beautySalon.dto.UserDto;

public interface AuthenticationService {
    UserTokenModel login(UserDto userDto);
    UserTokenModel register(UserDto userDto);
}
