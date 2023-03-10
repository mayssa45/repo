package com.example.kaddem.service;

import com.example.kaddem.Entity.Contrat;

import java.util.List;

public interface ContratService {
    List<Contrat> retrieveAllContrats();

    Contrat updateContrat (Contrat ce);

    Contrat addContrat (Contrat ce);

    Contrat retrieveContrat (Integer idContrat);

    void removeContrat(Integer idContrat);
}
