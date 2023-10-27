package com.kn.encapsulation;

public class ClassRoom {

	private int temperature; // attribute
//	private int temperature = 5;  //attribute

	// Getter method
	public int getTemperature() {
		return this.temperature;
	}

	public void setTemperature(int temperature) {
		if (temperature >= 16 && temperature <= 25) {
			this.temperature = temperature;
		} else {
			System.out.println("Invalid Temperature => The temperature should be between 16 to 25");
		}
	}
}
