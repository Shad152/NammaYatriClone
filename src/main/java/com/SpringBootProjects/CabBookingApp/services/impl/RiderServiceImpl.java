package com.SpringBootProjects.CabBookingApp.services.impl;

import com.SpringBootProjects.CabBookingApp.dto.DriverDto;
import com.SpringBootProjects.CabBookingApp.dto.RideDto;
import com.SpringBootProjects.CabBookingApp.dto.RideRequestDto;
import com.SpringBootProjects.CabBookingApp.services.RiderService;

public class RiderServiceImpl implements RiderService {
    @Override
    public RideDto requestRide(RideRequestDto rideRequestDto) {
        return null;
    }

    @Override
    public void cancelRide(Long rideId) {

    }

    @Override
    public DriverDto rateDriver(Long rideId) {
        return null;
    }
}
