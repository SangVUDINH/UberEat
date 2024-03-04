package com.svu.backEnd.dao;

import com.svu.backEnd.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {
    // Vous pouvez ajouter des méthodes spécifiques au besoin
}
