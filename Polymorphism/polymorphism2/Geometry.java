package com.kn.polymorphism2;

public class Geometry{
	
	public void doActivity(Shape sh) {
		sh.draw();
		System.out.println("Area = " + sh.calculateArea());
	}
}
