package com.example.kaddem.controller;

import com.example.kaddem.Entity.Contrat;
import com.example.kaddem.service.ContratService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/contrats")
@AllArgsConstructor
@RestController
public class ContratController {
    ContratService contratService;
    @GetMapping("/get-all")
    List<Contrat> getAllContrat(){
        return contratService.retrieveAllContrats ();
    }
    @GetMapping("/get-contrat/{id}")
    Contrat getContrat(@PathVariable Integer id){
        return contratService.retrieveContrat ( id );
    }
    @PostMapping("/add-contrat")
    Contrat addContrat(@RequestBody Contrat contrat){
        return contratService.addContrat ( contrat );
    }
    @PutMapping("/put-contrat")
    Contrat putContrat(@RequestBody Contrat contrat){
        return contratService.updateContrat ( contrat );
    }
    @DeleteMapping("/delete-contrat/{id}")
    void deleteContrat(@PathVariable Integer id){
        contratService.removeContrat ( id );
    }
}
