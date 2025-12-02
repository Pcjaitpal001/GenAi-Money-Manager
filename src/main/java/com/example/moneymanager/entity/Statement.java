package com.example.moneymanager.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Statements")
public class Statement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long balance;
    private Long account_id;
    private Long transferAmount;
    private String details;
    private LocalDateTime datetime;


}
