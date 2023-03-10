package com.example.kaddem.controller;

import com.example.kaddem.Entity.Equipe;
import com.example.kaddem.service.EquipeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/equipes")
@AllArgsConstructor
@RestController
public class EquipeController {
    EquipeService equipeService;
    @GetMapping("/get-all")
    List<Equipe> getAllEquipe(){
        return equipeService.retrieveAllEquipes ();
    }
    @GetMapping("/get-equipe/{id}")
    Equipe getEquipe(@PathVariable Integer id){
        return equipeService.retrieveEquipe ( id );
    }
    @PostMapping("/add-equipe")
    Equipe addEquipe(@RequestBody Equipe equipe){
        return equipeService.addEquipe ( equipe );
    }
    @PutMapping("/put-equipe")
    Equipe putEquipe(@RequestBody Equipe equipe){
        return equipeService.updateEquipe ( equipe );
    }
}
