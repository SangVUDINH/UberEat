package controller;

import entity.Livreur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.LivreurService;

import java.util.List;

@RestController
@RequestMapping("/livreurs")
public class LivreurController {
    @Autowired
    private LivreurService livreurService;

    @GetMapping
    public List<Livreur> listerLivreurs() {
        return livreurService.listeDesLivreurs();
    }

    @GetMapping("/{id}")
    public Livreur obtenirLivreur(@PathVariable Long id) {
        return livreurService.obtenirLivreurParId(id);
    }

    @PostMapping
    public Livreur ajouterLivreur(@RequestBody Livreur livreur) {
        return livreurService.ajouterLivreur(livreur);
    }

    @PutMapping("/{id}")
    public Livreur mettreAJourLivreur(@PathVariable Long id, @RequestBody Livreur livreur) {
        return livreurService.mettreAJourLivreur(id, livreur);
    }

    @DeleteMapping("/{id}")
    public void supprimerLivreur(@PathVariable Long id) {
        livreurService.supprimerLivreur(id);
    }
}

