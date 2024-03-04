package com.svu.backEnd.controller;

import com.svu.backEnd.entity.Utilisateur;
import com.svu.backEnd.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/utilisateurs")
public class UtilisateurController {
    @Autowired
    private UtilisateurService utilisateurService;

    @GetMapping
    public List<Utilisateur> listerUtilisateurs() {
        return utilisateurService.listeDesUtilisateurs();
    }

    @GetMapping("/{id}")
    public Utilisateur obtenirUtilisateur(@PathVariable int id) {
        return utilisateurService.obtenirUtilisateurParId(id);
    }

    @PostMapping
    public Utilisateur ajouterUtilisateur(@RequestBody Utilisateur utilisateur) {
        return utilisateurService.ajouterUtilisateur(utilisateur);
    }

    @PutMapping("/{id}")
    public Utilisateur mettreAJourUtilisateur(@PathVariable int id, @RequestBody Utilisateur utilisateur) {
        return utilisateurService.mettreAJourUtilisateur(id, utilisateur);
    }

    @DeleteMapping("/{id}")
    public void supprimerUtilisateur(@PathVariable int id) {
        utilisateurService.supprimerUtilisateur(id);
    }
}

