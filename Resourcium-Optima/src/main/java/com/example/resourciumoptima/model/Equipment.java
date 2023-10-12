package com.example.resourciumoptima.model;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Equipment")
public class Equipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nom;
    private String type;
    private Date dateAchat;
    private Date dateMaintenance;
    private String état;

    // Getters and setters
}
