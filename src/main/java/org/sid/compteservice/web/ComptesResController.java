package org.sid.compteservice.web;
import org.sid.compteservice.entities.Compte;
import org.sid.compteservice.repositories.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
public class ComptesResController {

    @Autowired
    private CompteRepository compteRepository;
    //Injection de dépendances via le constructeur
    public ComptesResController(CompteRepository compteRepository) {
        this.compteRepository = compteRepository;
    }

    @GetMapping(path = "/comptes")
    public List<Compte> listComptes(){
        return compteRepository.findAll();
    }

    @GetMapping(path = "/comptes/{id}")
    public Compte getCompte(@PathVariable(name = "id") Long code){
        return compteRepository.findById(code).get();
    }
    @PostMapping(path="/comptes")
    public Compte save(@RequestBody Compte compte){
        return compteRepository.save(compte);
    }
    @PutMapping(path="/comptes/{code}")
    public Compte upadte(@PathVariable Long code, @RequestBody Compte compte){
        compte.setCode(code);
        return compteRepository.save(compte);
    }
    @DeleteMapping(path="/comptes/{code}")
    public void dalete(@PathVariable Long code){
        compteRepository.deleteById(code);
    }

}
