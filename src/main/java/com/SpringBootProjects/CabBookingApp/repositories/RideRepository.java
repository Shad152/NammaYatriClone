package com.SpringBootProjects.CabBookingApp.repositories;

import com.SpringBootProjects.CabBookingApp.entities.Ride;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RideRepository extends JpaRepository<Ride,Long> {
}
