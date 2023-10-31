package com.rk.ShapeOopProjectOptimized;

//import java.util.Scanner;

public final class Square extends Shape {
//	  private Scanner scan = new Scanner(System.in);
//	  private float area = 0.0f;
	  private float side = 0.0f;
	  
	@Override
	void takingInput() {
		System.out.println("Enter side = ");
		side = scan.nextFloat();
	}

	@Override
	void calculateArea() {
		area = side * side;
	}

	/*
	@Override
	void displayArea() {
		System.out.println("Area = " + area);
	}
	*/

}
