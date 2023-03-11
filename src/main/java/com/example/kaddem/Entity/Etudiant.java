package com.example.kaddem.Entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.*;
//this student class
@Entity
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEtudiant;
    private String prenomE;
    private String nomE;
    private Option options;
    @ManyToMany(mappedBy = "etudiants", cascade = CascadeType.ALL)
    private Set<Equipe> equipes;

    @OneToMany(mappedBy = "etudiant")
    private Set<Contrat> contrats;

    @ManyToOne
    private Departement departement;
}
