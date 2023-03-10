package com.example.kaddem.Entity;

import jakarta.persistence.*;


import java.io.Serializable;

@Entity
public class DetailEquipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDetailEquipe;
    private Integer salle;
    private String thematique;

    @OneToOne(mappedBy ="detailEquipe")
    private Equipe equipe;
}