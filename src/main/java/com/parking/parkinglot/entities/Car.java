package com.parking.parkinglot.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "car")
public class Car {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false)
  private Long id;

  public User owner;

  public void setLicensePlate(String licensePlate) {
    this.licensePlate = licensePlate;
  }

  public void setParkingSpot(String parkingSpot) {
    this.parkingSpot = parkingSpot;
  }

  public String licensePlate;

  public String parkingSpot;

  @ManyToOne
  @JoinColumn(name = "id")
  public User getOwner() {
    return owner;
  }

  public void setOwner(User owner) {
    this.owner = owner;
  }

  public void setId(Long id) {
    this.id = id;
  }

    public Long getId() {
    return id;
  }
  public String getParkingSpot() {
    return parkingSpot;
  }

  public String getLicensePlate() {
    return licensePlate;
  }
}