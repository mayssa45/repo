package com.example.kaddem.repository;

import com.example.kaddem.Entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EtudiantRepository extends JpaRepository <Etudiant, Integer> {

}
