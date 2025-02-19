package com.SpringBootProjects.CabBookingApp.services;

import com.SpringBootProjects.CabBookingApp.dto.DriverDto;
import com.SpringBootProjects.CabBookingApp.dto.RideDto;
import com.SpringBootProjects.CabBookingApp.dto.RideRequestDto;
import com.SpringBootProjects.CabBookingApp.entities.enums.RideStatus;

public interface RideService {
    RideDto getRideById(Long rideId);

    void matchWithDrivers(RideRequestDto rideRequestDto);

    RideDto updateRideStatus(Long rideId);

    RideDto createNewRide(RideRequestDto rideRequestDto);

}
