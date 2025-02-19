package com.SpringBootProjects.CabBookingApp.services;

import com.SpringBootProjects.CabBookingApp.dto.DriverDto;
import com.SpringBootProjects.CabBookingApp.dto.SignUpDto;
import com.SpringBootProjects.CabBookingApp.dto.UserDto;
import com.SpringBootProjects.CabBookingApp.entities.User;

public interface AuthService {
        String login(String email,String password);

        UserDto signUp(SignUpDto signUpDto);

        DriverDto onboardNewDriver(Long userId);
}
