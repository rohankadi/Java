package com.rk.SuperAndFinal;

public class Eagle extends Bird{

	@Override
	void fly() {
		System.out.println("Eagle can fly very high......");
	}
	
	final void eat() {
		System.out.println("Eagle eats........");
	}
}
