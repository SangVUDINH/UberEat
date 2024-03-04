package com.svu.backEnd.dao;

import com.svu.backEnd.entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {
    Utilisateur findByNom(String nom);
}
