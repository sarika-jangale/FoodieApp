package com.foodservice.FavoriteService.DTO;

public class UserDTO {
    private String email;
    private String name;

    public UserDTO() {}

    public UserDTO(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}