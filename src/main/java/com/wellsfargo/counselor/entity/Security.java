package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long securityId;

    @ManyToOne
    @JoinColumn(name = "portfolio_id")
    private Portfolio portfolio;

    private String securityName;
    private String category;
    private LocalDateTime purchaseDate;
    private double purchasePrice;
    private int quantity;

    public Security() {}

    public Security(Portfolio portfolio, String securityName, String category,
                    LocalDateTime purchaseDate, double purchasePrice, int quantity) {

        this.portfolio = portfolio;
        this.securityName = securityName;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
    }

    // getters/setters
}
