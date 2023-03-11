package com.example.kaddem.Entity;


import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
//create comment here for specificity
@Entity
public class Contrat implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idContrat;
    private LocalDate dateDebutContrat;
    private  LocalDate dateFinContrat;
    private Specialite specialite;
    private Boolean archive;
    private Integer montantContrat;

    @ManyToOne
    private Etudiant etudiant;



}
