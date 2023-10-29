package com.rk.CompAggEx2;

public class Car {
	String brand;
	int price;
	String color;

	//composition
	Engine carEngine = new Engine("Diesel", 400);
	
	public Car(String brand, int price, String color) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
	}

}
