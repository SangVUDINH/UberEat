package controller;

import entity.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.RestaurantService;

import java.util.List;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {
    @Autowired
    private RestaurantService restaurantService;

    @GetMapping
    public List<Restaurant> listerRestaurants() {
        return restaurantService.listeDesRestaurants();
    }

    @GetMapping("/{id}")
    public Restaurant obtenirRestaurant(@PathVariable int id) {
        return restaurantService.obtenirRestaurantParId(id);
    }

    @PostMapping
    public Restaurant ajouterRestaurant(@RequestBody Restaurant restaurant) {
        return restaurantService.ajouterRestaurant(restaurant);
    }

    @PutMapping("/{id}")
    public Restaurant mettreAJourRestaurant(@PathVariable int id, @RequestBody Restaurant restaurant) {
        return restaurantService.mettreAJourRestaurant(id, restaurant);
    }

    @DeleteMapping("/{id}")
    public void supprimerRestaurant(@PathVariable int id) {
        restaurantService.supprimerRestaurant(id);
    }
}

