package com.SpringBootProjects.CabBookingApp.services.impl;

import com.SpringBootProjects.CabBookingApp.dto.RideDto;
import com.SpringBootProjects.CabBookingApp.dto.RideRequestDto;
import com.SpringBootProjects.CabBookingApp.dto.RiderDto;
import com.SpringBootProjects.CabBookingApp.services.DriverService;

public class DriverServiceImpl implements DriverService {
    @Override
    public RideDto acceptRide(RideRequestDto rideRequestId) {
        return null;
    }

    @Override
    public void cancelRide(RideRequestDto rideId) {

    }

    @Override
    public RideDto startRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto endRide(Long rideId) {
        return null;
    }

    @Override
    public RiderDto rateRider(Long rideId) {
        return null;
    }
}
