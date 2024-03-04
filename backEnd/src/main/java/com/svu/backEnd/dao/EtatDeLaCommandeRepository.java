package com.svu.backEnd.dao;

import com.svu.backEnd.entity.EtatDeLaCommande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtatDeLaCommandeRepository extends JpaRepository<EtatDeLaCommande, Long> {
    // Vous pouvez ajouter des méthodes de requête spécifiques si nécessaire
}

