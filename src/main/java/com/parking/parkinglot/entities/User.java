package com.parking.parkinglot.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String userName;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "userName")
    public String getUsername() {
        return userName;
    }

    public void setUsername(String userName) {
        this.userName = userName;
    }

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @OneToMany(mappedBy = "owner", orphanRemoval = false)
    private Collection<Car> cars = new ArrayList<>();

    public Collection<Car> getCars() {
        return cars;
    }

    public void setCars(Collection<Car> cars) {
        this.cars = cars;
    }
}