package com.SpringBootProjects.CabBookingApp.services;

import com.SpringBootProjects.CabBookingApp.dto.RideDto;
import com.SpringBootProjects.CabBookingApp.dto.RideRequestDto;
import com.SpringBootProjects.CabBookingApp.dto.RiderDto;

public interface DriverService {
      RideDto acceptRide(RideRequestDto rideRequestId);

      void cancelRide(RideRequestDto rideId);

      RideDto startRide(Long rideId);

      RideDto endRide(Long rideId);

      RiderDto rateRider(Long rideId);
}
