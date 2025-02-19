package com.SpringBootProjects.CabBookingApp.entities;

import com.SpringBootProjects.CabBookingApp.entities.enums.TransactionMethod;
import com.SpringBootProjects.CabBookingApp.entities.enums.TransactionStatus;
import com.SpringBootProjects.CabBookingApp.entities.enums.TransactionType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WalletTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;

    @ManyToOne
    private Wallet wallet;

    @Enumerated(EnumType.STRING)
    private TransactionStatus transactionStatus;

    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;

    @Enumerated(EnumType.STRING)
    private TransactionMethod transactionMethod;

    @OneToOne
    private Ride ride;

    @CreationTimestamp
    private LocalDateTime timeStamp;
}
