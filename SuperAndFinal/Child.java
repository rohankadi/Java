package com.rk.SuperAndFinal;

public class Child extends Parent{

	int a = 20;
	
	public void display() {
		System.out.println("a = " + a);
		System.out.println("super.a = " + super.a);
		System.out.println("Hello World!");
		
		super.display();
	}
}
