package com.SpringBootProjects.CabBookingApp.dto;

import com.SpringBootProjects.CabBookingApp.entities.enums.RideRequestStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RideRequestDto {
    private RiderDto riderDto;
    private PointDto pickupLocation;
    private PointDto dropOffLocation;
    private LocalDateTime requestedAt;
    private RideRequestStatus rideRequestStatus;
}
