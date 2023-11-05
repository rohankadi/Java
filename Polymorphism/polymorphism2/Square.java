package com.kn.polymorphism2;

public class Square extends Shape{
	double side = 55;
	
	@Override
	public double calculateArea() {
		return side * side;
	}
	
	//child specific method
		public double calculatePerimeter() {
			return 4*side;
	}
}
