package org.example.Restaurants.Controller;


import jakarta.validation.Valid;
import org.example.Restaurants.Model.Restaurant;
import org.example.Restaurants.Service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@RestController
public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;

    //Get Mapping to get restaurant by ID
    @GetMapping("restaurant/ID/{ID}")
    public Restaurant getRestaurantById(@PathVariable Integer ID)
    {
        return restaurantService.getRestaurantByID(ID);
    }

    //Get Mapping to get all restaurant
    @GetMapping("restaurants")
    public List<Restaurant> getRestaurantList()
    {
        return restaurantService.getRestaurantList();
    }

    //Post Mapping to add a list of restaurants
    @PostMapping("addRestaurants")
    public String addRestaurants(@Valid @RequestBody List<Restaurant> restaurants)
    {
        return restaurantService.addRestaurants(restaurants);
    }


    //Put Mapping to update something in restaurant
    @PutMapping("updateRestaurantSpeciality/{ID}/{speciality}")
    public String updateSpeciality(@PathVariable Integer ID, @PathVariable String speciality)
    {
        return restaurantService.updateSpeciality(ID, speciality);
    }


    //delete Mapping to delete a restaurant
    @DeleteMapping("deleteRestaurant/{ID}")
    public String deleteRestaurant(@PathVariable Integer ID)
    {
        return restaurantService.deleteRestaurant(ID);
    }
}
