package com.example.Aula06SecurityAuth.controller;

public class UserResponseDTO {
    private String userName;

    public UserResponseDTO() {
    }

    public UserResponseDTO(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
