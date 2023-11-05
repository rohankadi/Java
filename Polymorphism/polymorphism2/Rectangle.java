package com.kn.polymorphism2;

public class Rectangle extends Shape {
	double l = 55, b = 10.5;

	@Override
	public double calculateArea() {
		return l * b;
	}

	// child specific method
	public double calculatePerimeter() {
		return 2 * (l + b);
	}
}
