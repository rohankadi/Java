package com.rk.ShapeOopProject;

import java.util.Scanner;

public final class Square extends Shape {
	private Scanner scan = new Scanner(System.in);
	private float side = 0.0f;
	private float area = 0.0f;
	
	@Override
	public void takeinput() {
		System.out.println("Enter Side : ");
		side = scan.nextFloat();
	}

	@Override
	public void calculateArea() {
		area = (side * side);
	}

	@Override
	public void displayArea() {
		System.out.println("Area = " + area);
	}

}
