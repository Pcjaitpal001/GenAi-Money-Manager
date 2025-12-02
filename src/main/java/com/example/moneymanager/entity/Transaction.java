package com.example.moneymanager.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name="Transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime dateTime;
    private BigDecimal amount;
    private Long transferForm;
    private Long transferTo;
    private String note;
    private Long user_id;
}
