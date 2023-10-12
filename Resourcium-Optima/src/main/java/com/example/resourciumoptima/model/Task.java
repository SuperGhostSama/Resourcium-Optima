package com.example.resourciumoptima.model;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int identifiant;

    private String description;
    private Date dateLimite;
    private int priorité;

    @ManyToOne
    @JoinColumn(name = "employéAssigné_id")
    private Employee employéAssigné;

    @Enumerated(EnumType.STRING)
    private Status statut;

}
