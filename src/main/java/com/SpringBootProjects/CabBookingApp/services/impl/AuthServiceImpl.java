package com.SpringBootProjects.CabBookingApp.services.impl;

import com.SpringBootProjects.CabBookingApp.dto.DriverDto;
import com.SpringBootProjects.CabBookingApp.dto.SignUpDto;
import com.SpringBootProjects.CabBookingApp.dto.UserDto;
import com.SpringBootProjects.CabBookingApp.services.AuthService;

public class AuthServiceImpl implements AuthService {
    @Override
    public String login(String email, String password) {
        return null;
    }

    @Override
    public UserDto signUp(SignUpDto signUpDto) {
        return null;
    }

    @Override
    public DriverDto onboardNewDriver(Long userId) {
        return null;
    }
}
