package com.test.test.controller;

import com.test.test.dao.IGestionEtudiant;
import com.test.test.model.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
public class Controller {

    @Autowired
    IGestionEtudiant gestionEtudiant;

    public void setGestionEtudiant (IGestionEtudiant gestionEtudiant){
        this.gestionEtudiant = gestionEtudiant;
    }

    @GetMapping("/etudiants")
    public List<Etudiant> getAllEtudiant(){
        return gestionEtudiant.findAll();
    }
    @PostMapping("/addEtudiant")
    public void add(@RequestBody Etudiant etudiant){
        gestionEtudiant.save(etudiant);
    }
    @DeleteMapping("/deleteEtudiant/{id}")
    public void delete(@PathVariable("id") int id){
        gestionEtudiant.deleteById(id);
    }
}
