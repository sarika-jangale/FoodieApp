package com.foodservice.RestaurantService.DTO;

import com.foodservice.RestaurantService.Model.MenuItem;

public class MenuResponseDTO {
    private String id;
    private String restaurantId;
    private String name;
    private String description;
    private double price;
    private String imageUrl;

    // Constructor
    public MenuResponseDTO() {}

    // Parameterized Constructor
    public MenuResponseDTO(String id, String restaurantId, String name, String description, double price, String imageUrl) {
        this.id = id;
        this.restaurantId = restaurantId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    public MenuResponseDTO(MenuItem menuItem) {

    }

    public MenuResponseDTO(String name, double price, String imageUrl) {

    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}