package com.parking.parkinglot.common;

public class UserDto {
    Long id;
    String userName;
    String email;

    public UserDto(Long id, String userName, String email) {
        this.id = id;
        this.userName = userName;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
}
