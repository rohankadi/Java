package com.rk.ShapeOopProjectOptimized;

//import java.util.Scanner;

public final class Rectangle extends Shape {

	//private Scanner scan = new Scanner(System.in);
	//private float area = 0.0f;
	private float length = 0.0f;
	private float breadth = 0.0f;
	
	@Override
	public void takingInput() {
		System.out.println("Enter length = ");
		length = scan.nextFloat();
		System.out.println("Enter width = ");
		breadth = scan.nextFloat();
	}

	@Override
	public void calculateArea() {
		area = length * breadth;
	}

	/*
	@Override
	public void displayArea() {
		System.out.println("Area = " + area);
	}
	*/
}
