package com.rk.CompAggEx2;

public class Bike {
	String brand;
	int price;
	String color;
	
	//composition
	Engine bikeEngine = new Engine("Petrol", 200);

	public Bike(String brand, int price, String color) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
	}
}
