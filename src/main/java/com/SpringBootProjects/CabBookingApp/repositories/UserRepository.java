package com.SpringBootProjects.CabBookingApp.repositories;

import com.SpringBootProjects.CabBookingApp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
