package com.SpringBootProjects.CabBookingApp.repositories;

import com.SpringBootProjects.CabBookingApp.entities.RideRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RideRequestRepository extends JpaRepository<RideRequest,Long> {
}
