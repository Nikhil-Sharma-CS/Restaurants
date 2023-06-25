# Restaurant Managing

This is the code for **Restaurant** Management System.
This implement various API's like **Get**, **Post**, **Put**, **Delete** to function as desired.


## 🚀 About Me
Hi, My name is Nikhil Sharma,

I'm a full stack developer trainee at Geekster. I have knowledge of Java, OOPs, Maven, APIs, DSA.


## Data Flow

### Controller
-   This section contains a class named RestaurantController which user functions as mentioned below :

       #### 1. GetMapping("restaurants") : This returns the list of all the restaurants.
       #### 2. GetMapping("restaurant/ID/{ID}") : This returns the details of the restaurant by entering its ID in path variable.
       #### 3. @PostMapping("addRestaurants") : This helps in entering the list of restaurants with their attributes and details.
       #### 4. @PutMapping("updateRestaurantSpeciality/{ID}/{speciality}") : This helps in updating the Speciality attribute of a restaurant.
       #### 5 : @DeleteMapping("deleteRestaurant/{ID}") : This deletes the restaurant whose ID is been provided.


### Services
-   This section contains a class RestaurantService with functions that helps API to perform their specific tasks : 

    #### 1. List<Restaurant> getRestaurantList()
    #### 2. Restaurant getRestaurantByID(Integer ID)
    #### 3. String addRestaurants(List<Restaurant> restaurants)
    #### 4. String updateSpeciality(Integer ID, String speciality)
    #### 5. String deleteRestaurant(Integer ID)
    

###  Repository
-   This section contains a class RestaurantRepo which returns the list of restaurants type.

    #### 1. private List<Restaurant>

### Database Design
-   In this section we used a Restaurant class to define a particular Restaurant with its attributes like name, staff, address, etc.


## Data Structure Used

- We used a array list of type Restaurants, which will hold the list of all the Restaurants created.
## Summary

This project performs the task managing a **list of restaurants** with their speicific details.
We also used **Validation** in this project on a attribute of Restaurant named **restroID**, this Validation is called **NotBlank** which will make sure the restroID entered at time of creating a Restaurant is not blank and has some value provided in it.
We used **MVC Architecture** to create this project. 
And this is created in **SpringBoot** using **Maven** and **Java**.


## 🔗 Links
[![Github](https://img.shields.io/badge/Github-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://github.com/Nikhil-Sharma-CS)
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/nikhil-sharma-cse)
