package com.kn.polymorphism2;

public class Circle extends Shape{
	
	double r = 25;
	
	@Override
	public double calculateArea() {
		return Math.PI*r*r;
	}	
	
	//child specific method
	public double calculatePerimeter() {
		return 2 * Math.PI * r;
	}
}
