package org.example.Restaurants.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {

    private Integer restroID;
    private String name;
    private String address;
    private Integer totalStaff;
    private String speciality;
}
