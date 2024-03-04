package com.svu.backEnd.service;

import com.svu.backEnd.entity.Restaurant;
import com.svu.backEnd.dao.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RestaurantService {
    @Autowired
    private RestaurantRepository restaurantRepository;

    public List<Restaurant> listeDesRestaurants() {
        return restaurantRepository.findAll();
    }

    public Restaurant obtenirRestaurantParId(int id) {
        return restaurantRepository.findById(id).orElse(null);
    }

    public Restaurant ajouterRestaurant(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }

    public Restaurant mettreAJourRestaurant(int id, Restaurant restaurant) {
        restaurant.setId(id);
        return restaurantRepository.save(restaurant);
    }

    public void supprimerRestaurant(int id) {
        restaurantRepository.deleteById(id);
    }
}
