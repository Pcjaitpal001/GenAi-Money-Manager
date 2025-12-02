package com.example.moneymanager.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long balance;

    private User user;
    private String prathamesh;

}
