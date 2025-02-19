package com.SpringBootProjects.CabBookingApp.dto;

import com.SpringBootProjects.CabBookingApp.entities.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private String name;
    private String email;
    private Set<Role> roles;
}
