package com.example.resourciumoptima.model;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nomUtilisateur;
    private String motDePasse;
    private String nom;
    private String prénom;
    private String adresseEmail;
    private String poste;
    private Date dateEmbauche;

    // Getters and setters
}
