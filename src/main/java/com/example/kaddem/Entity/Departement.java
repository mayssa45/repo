package com.example.kaddem.Entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.*;
@Entity
public class Departement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDeppart;
    private String nomDepat;

    @OneToMany(mappedBy = "departement")
    private Set<Etudiant> etudiants;


}
