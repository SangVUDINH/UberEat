package service;

import dao.LivreurRepository;
import entity.Livreur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivreurService {
    private final LivreurRepository livreurRepository;

    @Autowired
    public LivreurService(LivreurRepository livreurRepository) {
        this.livreurRepository = livreurRepository;
    }

    public List<Livreur> listeDesLivreurs() {
        return livreurRepository.findAll();
    }

    public Livreur obtenirLivreurParId(Long id) {
        return livreurRepository.findById(id).orElse(null);
    }

    public Livreur ajouterLivreur(Livreur livreur) {
        return livreurRepository.save(livreur);
    }

    public Livreur mettreAJourLivreur(Long id, Livreur livreur) {
        livreur.setId(id);
        return livreurRepository.save(livreur);
    }

    public void supprimerLivreur(Long id) {
        livreurRepository.deleteById(id);
    }
}

