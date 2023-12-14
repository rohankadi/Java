package com.kodnest.hibernet_Project2;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bike {

	// Attributes
	@Id
	int bikeId;
	String brand;
	String color;

	// Zero parameterized constructor
	public Bike() {
	}

	// Two parameterized constructor
	public Bike(int bikeId, String brand, String color) {
		this.bikeId = bikeId;
		this.brand = brand;
		this.color = color;
	}

	// Getters and Setters
	public int getBikeId() {
		return bikeId;
	}

	public void setBikeId(int bikeId) {
		this.bikeId = bikeId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
