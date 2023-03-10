package com.example.kaddem.controller;

import com.example.kaddem.Entity.Etudiant;
import com.example.kaddem.service.EtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/etudiants")
@AllArgsConstructor
@RestController
public class EtudiantController {
    EtudiantService etudiantService;
    @GetMapping("/get-all")
    List<Etudiant> getAllEtudiant(){
        return etudiantService.retrieveAllEtudiants();
    }
    @GetMapping("/get-etudiant/{id}")
    Etudiant getEtudiant(@PathVariable Integer id){
        return etudiantService.retrieveEtudiant(id);
    }
    @PostMapping("/add-etudiant")
    Etudiant addEtudiant(@RequestBody Etudiant etudiant){
        return etudiantService.addEtudiant ( etudiant );
    }
    @PutMapping("/put-etudiant")
    Etudiant putEtudiant(@RequestBody Etudiant etudiant){
        return etudiantService.updateEtudiant ( etudiant );
    }
    @DeleteMapping("/delete-etudiant/{id}")
    void deleteEtudiant(@PathVariable Integer id){
        etudiantService.removeEtudiant ( id );
    }
}
