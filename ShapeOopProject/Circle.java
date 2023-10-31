//inheritance
package com.rk.ShapeOopProject;

import java.util.Scanner;

//Abstraction
public final class Circle extends Shape {
	// Encapsulation
	private Scanner scan = new Scanner(System.in);
	private float radius = 0.0f;
	// because, PI value is constant no need any copy
	static private float pi = 3.142f;

	private float area = 0.0f;
	
	
	//Polymorphism
	@Override
	public void takeinput() {
		System.out.println("Enter radius : ");
		radius = scan.nextFloat();
	}

	@Override
	public void calculateArea() {
		area = pi * radius * radius;
	}

	@Override
	public void displayArea() {
		System.out.println("Area " + area);

	}
}
