package com.svu.backEnd.service;

import com.svu.backEnd.entity.Livreur;
import com.svu.backEnd.dao.LivreurRepository;
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

