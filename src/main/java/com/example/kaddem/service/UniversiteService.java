package com.example.kaddem.service;

import com.example.kaddem.Entity.Universite;

import java.util.List;

public interface UniversiteService {
    List<Universite> retrieveAllUniversites();
    Universite addUniversite (Universite u);
    Universite updateUniversite (Universite u);
    Universite retrieveUniversite (Integer idUniversite);
}
