package com.SpringBootProjects.CabBookingApp.repositories;

import com.SpringBootProjects.CabBookingApp.entities.Rider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RiderRepository extends JpaRepository<Rider,Long> {
}
