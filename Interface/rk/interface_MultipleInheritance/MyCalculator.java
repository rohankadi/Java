package com.rk.interface_MultipleInheritance;

public class MyCalculator implements Calculator1, Calculator2 {

	@Override
	public void add() {
		int a = 10;
		int b = 20;
		System.out.println("Addition of 2 numbers is " + (a + b));
	}
}
