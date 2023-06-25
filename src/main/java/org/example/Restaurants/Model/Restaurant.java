package org.example.Restaurants.Model;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {

    @NotBlank(message = "ID cannot be blank")
    private Integer restroID;
    private String name;
    private String address;
    private Integer totalStaff;
    private String speciality;
}
