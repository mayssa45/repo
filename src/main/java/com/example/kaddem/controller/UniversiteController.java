package com.example.kaddem.controller;

import com.example.kaddem.Entity.Equipe;
import com.example.kaddem.Entity.Universite;
import com.example.kaddem.service.EquipeService;
import com.example.kaddem.service.UniversiteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/universites")
@AllArgsConstructor
@RestController
public class UniversiteController {
    UniversiteService universiteService;
    @GetMapping("/get-all")
    List<Universite> getAllUniversite(){
        return universiteService.retrieveAllUniversites ();
    }
    @GetMapping("/get-universite/{id}")
    Universite getUniversite(@PathVariable Integer id){
        return universiteService.retrieveUniversite ( id );
    }
    @PostMapping("/add-universite")
    Universite addUniversite(@RequestBody Universite universite){
        return universiteService.addUniversite ( universite );
    }
    @PutMapping("/put-universite")
    Universite putUniversite(@RequestBody Universite universite){
        return universiteService.updateUniversite ( universite );
    }


}
