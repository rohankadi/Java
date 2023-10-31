package com.rk.ShapeOopProjectOptimized;

import java.util.Scanner;

abstract public class Shape {
	//picking all common data 
	 Scanner scan = new Scanner(System.in);
	 public float area = 0.0f;
	 
	abstract void takingInput();
	abstract void calculateArea();
// abstract void displayArea();

	//Common in all classes so, directly giving it in Parent which inherited by child
	void displayArea() {
		System.out.println("Area = " + area);
	}
}
