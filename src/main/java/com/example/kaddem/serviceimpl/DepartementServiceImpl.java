package com.example.kaddem.serviceimpl;

import com.example.kaddem.Entity.Departement;
import com.example.kaddem.repository.DepartementRepository;
import com.example.kaddem.service.DepartementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartementServiceImpl implements DepartementService {
    @Autowired
    DepartementRepository departementRepository;
    @Override
    public List<Departement> retrieveAllDepartements() {
        return departementRepository.findAll();
    }

    @Override
    public Departement addDepartement(Departement d) {
        return departementRepository.save(d);
    }

    @Override
    public Departement updateDepartement(Departement d) {
        return departementRepository.save(d);
    }

    @Override
    public Departement retrieveDepartement(Integer idDepart) {
        return departementRepository.findById(idDepart).orElseGet(null);
    }
}
