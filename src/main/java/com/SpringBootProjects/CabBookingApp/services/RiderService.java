package com.SpringBootProjects.CabBookingApp.services;

import com.SpringBootProjects.CabBookingApp.dto.DriverDto;
import com.SpringBootProjects.CabBookingApp.dto.RideDto;
import com.SpringBootProjects.CabBookingApp.dto.RideRequestDto;

public interface RiderService {
    RideDto requestRide(RideRequestDto rideRequestDto);

    void cancelRide(Long rideId);

    DriverDto rateDriver(Long rideId);

}
