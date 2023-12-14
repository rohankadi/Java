package com.kodnest.hibernate_Project2_bidirectional;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Bike {

	// Attributes
	@Id
	int bikeId;
	String brand;
	String color;

	@OneToOne
	Student st;
	
	// Zero parameterized constructor
	public Bike() {
	}

	// Two parameterized constructor
	public Bike(int bikeId, String brand, String color, Student st) {
		this.bikeId = bikeId;
		this.brand = brand;
		this.color = color;
		this.st = st;
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
	
	public Student getSt() {
		return st;
	}

	public void setSt(Student st) {
		this.st = st;
	}
	
}

