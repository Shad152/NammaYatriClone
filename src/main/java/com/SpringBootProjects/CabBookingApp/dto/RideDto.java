package com.SpringBootProjects.CabBookingApp.dto;

import com.SpringBootProjects.CabBookingApp.entities.enums.PaymentStatus;
import com.SpringBootProjects.CabBookingApp.entities.enums.RideStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RideDto {
    private RiderDto rider;
    private DriverDto driver;
    private PointDto pickupLocation;
    private PointDto dropOffLocation;
    private Double fare;
    private RideStatus rideStatus;
    private PaymentStatus paymentStatus;
    private LocalDateTime startedAt;
    private LocalDateTime endedAt;
}
