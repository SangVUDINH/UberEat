package controller;

import entity.EtatDeLaCommande;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.EtatDeLaCommandeService;

import java.util.List;

@RestController
@RequestMapping("/etats-commande")
public class EtatDeLaCommandeController {
    @Autowired
    private EtatDeLaCommandeService etatDeLaCommandeService;

    @GetMapping
    public List<EtatDeLaCommande> listerEtatsDeCommande() {
        return etatDeLaCommandeService.listeDesEtatsDeCommande();
    }

    @GetMapping("/{id}")
    public EtatDeLaCommande obtenirEtatDeCommande(@PathVariable Long id) {
        return etatDeLaCommandeService.obtenirEtatDeCommandeParId(id);
    }

    @PostMapping
    public EtatDeLaCommande ajouterEtatDeCommande(@RequestBody EtatDeLaCommande etatDeLaCommande) {
        return etatDeLaCommandeService.ajouterEtatDeCommande(etatDeLaCommande);
    }

    @PutMapping("/{id}")
    public EtatDeLaCommande mettreAJourEtatDeCommande(@PathVariable Long id, @RequestBody EtatDeLaCommande etatDeLaCommande) {
        return etatDeLaCommandeService.mettreAJourEtatDeCommande(id, etatDeLaCommande);
    }

    @DeleteMapping("/{id}")
    public void supprimerEtatDeCommande(@PathVariable Long id) {
        etatDeLaCommandeService.supprimerEtatDeCommande(id);
    }
}

