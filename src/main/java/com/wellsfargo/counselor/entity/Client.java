package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;

    private String firstName;
    private String lastName;
    private String riskProfile;

    @ManyToOne
    @JoinColumn(name = "advisor_id")
    private FinancialAdvisor advisor;

    public Client() {}

    public Client(String firstName, String lastName, String riskProfile, FinancialAdvisor advisor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.riskProfile = riskProfile;
        this.advisor = advisor;
    }
}
