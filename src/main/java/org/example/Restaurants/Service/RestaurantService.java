package org.example.Restaurants.Service;

import org.example.Restaurants.Model.Restaurant;
import org.example.Restaurants.Repository.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {

    @Autowired
    RestaurantRepo restaurantRepo;

    public List<Restaurant> getRestaurantList() {
        return restaurantRepo.getRestaurantList();
    }

    public Restaurant getRestaurantByID(Integer ID) {
        List<Restaurant> restroList = restaurantRepo.getRestaurantList();

        for(Restaurant restaurant : restroList)
        {
            if(restaurant.getRestroID().equals(ID))
            {
                return restaurant;
            }
        }
        return null;
    }

    public String addRestaurants(List<Restaurant> restaurants) {
        List<Restaurant> restroList = restaurantRepo.getRestaurantList();

        restroList.addAll(restaurants);
        return "Restaurants added.";
    }

    public String updateSpeciality(Integer ID, String speciality) {
        List<Restaurant> restroList = restaurantRepo.getRestaurantList();

        for(Restaurant restaurant : restroList)
        {
            if(restaurant.getRestroID().equals(ID))
            {
                restaurant.setSpeciality(speciality);
                return "Speciality Updated.";
            }
        }
        return "Restaurant Not Found.";
    }

    public String deleteRestaurant(Integer ID) {
        List<Restaurant> restroList = restaurantRepo.getRestaurantList();

        for(Restaurant restaurant : restroList) {
            if (restaurant.getRestroID().equals(ID)) {
                restroList.remove(restaurant);
                return "Restaurant Removed.";
            }
        }
        return "Restaurant Not Found.";
    }
}
