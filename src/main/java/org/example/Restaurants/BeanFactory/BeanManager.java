package org.example.Restaurants.BeanFactory;

import org.example.Restaurants.Model.Restaurant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanManager {

    @Bean
    public List<Restaurant> getList()
    {
        return new ArrayList<>();
    }
}
