package com.SpringBootProjects.CabBookingApp.entities;

import com.SpringBootProjects.CabBookingApp.entities.enums.PaymentMethod;
import com.SpringBootProjects.CabBookingApp.entities.enums.PaymentStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn( name = "ride_id")
    private Ride ride;

    private Double amount;
    @OneToOne
    private WalletTransaction walletTransaction;
    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;

}
