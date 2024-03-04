package com.svu.backEnd.dao;

import com.svu.backEnd.entity.Livreur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivreurRepository extends JpaRepository<Livreur, Long> {
    // Vous pouvez ajouter des méthodes de requête spécifiques si nécessaire
}
