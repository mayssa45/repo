package com.example.kaddem.Entity;

import jakarta.persistence.*;


import java.io.Serializable;
import java.util.*;

@Entity
public class Equipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEquipe;
    private String nomEquipe;
    private Niveau niveau;

    @OneToOne
    private DetailEquipe detailEquipe;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants;
}
