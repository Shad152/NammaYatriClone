package com.SpringBootProjects.CabBookingApp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DriverDto {
    private UserDto userDto;
    private PointDto currentLocation;
    private Double rating;
    private Boolean isAvailable;
    private String vehicleId;
}
