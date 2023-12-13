package dao;

import entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitRepository extends JpaRepository<Produit, Integer> {
    // Vous pouvez ajouter des méthodes spécifiques au besoin
}
