package com.SpringBootProjects.CabBookingApp.entities;

import com.SpringBootProjects.CabBookingApp.entities.enums.PaymentMethod;
import com.SpringBootProjects.CabBookingApp.entities.enums.PaymentStatus;
import com.SpringBootProjects.CabBookingApp.entities.enums.RideStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ride {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Rider rider;
    @ManyToOne
    private Driver driver;
    @Column(columnDefinition = "Geometry(Point,4326)")
    private Point pickupLocation;
    @Column(columnDefinition = "Geometry(Point,4326)")
    private Point dropOffLocation;
    private Double fare;
    @Enumerated(EnumType.STRING)
    private RideStatus rideStatus;
    @OneToOne
    private Payment payment;
    @CreationTimestamp
    private LocalDateTime createdAt;
    private Long otp;
    private LocalDateTime startedAt;
    private LocalDateTime endedAt;
}
