package com.saas.epc.company.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Company")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String companyName;
    @Column(nullable = false)
    private String companyGSTNumber;
    @Column(nullable = false)
    private String companyEmail;
    private String companyPhone;
    private String companyAddress;
}
