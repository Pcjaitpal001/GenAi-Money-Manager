package com.example.moneymanager.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Expenses")
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long currentSpent;
    private Long totalSpent;
    private Long User_ID;
}
