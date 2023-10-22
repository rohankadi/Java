package com.kn.multilevel_inheritance;

public class VehicleDemo {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		v1.regNumber = 2023;
		System.out.println("Registration Number = " + v1.regNumber);
		v1.move();
		
		System.out.println("***************************");
		
		Car c1 = new Car();
		c1.regNumber = 3333;
		System.out.println("Registration Number = " + c1.regNumber);
		c1.move();
		c1.wheels();
		
		System.out.println("***************************");
		
		Sedan s1 = new Sedan();
		s1.regNumber = 1234;
		System.out.println("Registration Number = " + s1.regNumber);
		s1.move();
		s1.wheels();
	}

}
