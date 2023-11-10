package com.durgasoft.abstractModifiers;
//child class is fully implemented the parent class but still we can declare the class as ABSTRACT 
//to avoid object creation by the user
public abstract class Eagle extends Bird {

	@Override
	void fly() {
		System.out.println("Eagle fly very high....");

	}

	@Override
	void eat() {
		System.out.println("Eagle eats by hunting....");

	}

	@Override
	void sleep() {
		System.out.println("Eagle sleeps in nest");
	}

}
