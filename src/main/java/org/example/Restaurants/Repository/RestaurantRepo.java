package org.example.Restaurants.Repository;

import org.example.Restaurants.Model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RestaurantRepo {

    @Autowired
    private List<Restaurant> restaurantList;

    public List<Restaurant> getRestaurantList()
    {
        return restaurantList;
    }
}
