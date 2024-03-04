package com.svu.backEnd.controller;

import com.svu.backEnd.entity.Commande;
import com.svu.backEnd.service.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/commandes")
public class CommandeController {
    @Autowired
    private CommandeService commandeService;

    @GetMapping
    public List<Commande> listerCommandes() {
        return commandeService.listeDesCommandes();
    }

    @GetMapping("/{id}")
    public Commande obtenirCommande(@PathVariable Long id) {
        return commandeService.obtenirCommandeParId(id);
    }

    @PostMapping
    public Commande ajouterCommande(@RequestBody Commande commande) {
        return commandeService.ajouterCommande(commande);
    }

    @PutMapping("/{id}")
    public Commande mettreAJourCommande(@PathVariable Long id, @RequestBody Commande commande) {
        return commandeService.mettreAJourCommande(id, commande);
    }

    @DeleteMapping("/{id}")
    public void supprimerCommande(@PathVariable Long id) {
        commandeService.supprimerCommande(id);
    }
}
