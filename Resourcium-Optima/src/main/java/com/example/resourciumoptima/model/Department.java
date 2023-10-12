package com.example.resourciumoptima.model;
import jakarta.persistence.*;

@Entity
@Table(name = "Department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nom;
    private String description;

    @ManyToOne
    @JoinColumn(name = "chefDepartement_id")
    private Employee chefDepartement;

}

