package com.example.kaddem.Entity;

import com.example.kaddem.Entity.Departement;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.*;

@Entity
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUniv;
    private String nomUniv;

    @OneToMany
    private  Set<Departement> departements;

}
