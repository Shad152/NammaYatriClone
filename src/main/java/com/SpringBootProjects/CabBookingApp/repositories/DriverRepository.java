package com.SpringBootProjects.CabBookingApp.repositories;

import com.SpringBootProjects.CabBookingApp.entities.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver,Long> {
}
