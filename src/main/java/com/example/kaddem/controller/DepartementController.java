package com.example.kaddem.controller;

import com.example.kaddem.Entity.Departement;
import com.example.kaddem.service.DepartementService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/departements")
@AllArgsConstructor
@RestController
public class DepartementController {
    DepartementService departementService;
    @GetMapping("/get-all")
    List<Departement> getAllDepartement(){
        return departementService.retrieveAllDepartements ();
    }
    @GetMapping("/get-departement/{id}")
    Departement getDepartement(@PathVariable Integer id){
        return departementService.retrieveDepartement ( id );
    }
    @PostMapping("/add-departement")
    Departement addDepartrement(@RequestBody Departement departement){
        return departementService.addDepartement ( departement );
    }
    @PutMapping("/put-departement")
    Departement putDepartement(@RequestBody Departement departement){
        return departementService.updateDepartement ( departement );
    }

}
