package com.example.kaddem.service;

import com.example.kaddem.Entity.Departement;

import java.util.List;

public interface DepartementService {
    List<Departement> retrieveAllDepartements();

    Departement addDepartement (Departement d);

    Departement updateDepartement (Departement d);

    Departement retrieveDepartement (Integer idDepart);
}
