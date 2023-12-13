package controller;

import entity.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.ProduitService;

import java.util.List;

@RestController
@RequestMapping("/produits")
public class ProduitController {
    @Autowired
    private ProduitService produitService;

    @GetMapping
    public List<Produit> listerProduits() {
        return produitService.listeDesProduits();
    }

    @GetMapping("/{id}")
    public Produit obtenirProduit(@PathVariable int id) {
        return produitService.obtenirProduitParId(id);
    }

    @PostMapping
    public Produit ajouterProduit(@RequestBody Produit produit) {
        return produitService.ajouterProduit(produit);
    }

    @PutMapping("/{id}")
    public Produit mettreAJourProduit(@PathVariable int id, @RequestBody Produit produit) {
        return produitService.mettreAJourProduit(id, produit);
    }

    @DeleteMapping("/{id}")
    public void supprimerProduit(@PathVariable int id) {
        produitService.supprimerProduit(id);
    }
}
