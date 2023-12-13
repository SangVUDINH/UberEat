package service;

import dao.ProduitRepository;
import entity.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProduitService {
    @Autowired
    private ProduitRepository produitRepository;

    public List<Produit> listeDesProduits() {
        return produitRepository.findAll();
    }

    public Produit obtenirProduitParId(int id) {
        return produitRepository.findById(id).orElse(null);
    }

    public Produit ajouterProduit(Produit produit) {
        return produitRepository.save(produit);
    }

    public Produit mettreAJourProduit(int id, Produit produit) {
        produit.setId(id);
        return produitRepository.save(produit);
    }

    public void supprimerProduit(int id) {
        produitRepository.deleteById(id);
    }
}

