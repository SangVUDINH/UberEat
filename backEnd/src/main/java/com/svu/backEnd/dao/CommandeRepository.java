package com.svu.backEnd.dao;

import com.svu.backEnd.entity.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandeRepository extends JpaRepository<Commande, Long> {
    // Vous pouvez ajouter des méthodes de requête spécifiques si nécessaire
}
