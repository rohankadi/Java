package com.rk.ShapeOopProjectOptimized;

//import java.util.Scanner;

public final class Circle extends Shape {
   //private Scanner scan = new Scanner(System.in);
	// private float area = 0.0f;
   private float radius = 0.0f;
   private static final float pi = 3.147f;
   
	@Override
	void takingInput() {
	System.out.println("Enter radius = ");	
	radius = scan.nextFloat();
	}

	@Override
	void calculateArea() {
		area = pi * radius * radius;
	}

	/*
	@Override
	void displayArea() {
		System.out.println("Area = " + area);
	}
	*/

}
