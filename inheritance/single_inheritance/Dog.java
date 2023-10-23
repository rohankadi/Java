package com.kn.single_inheritance;

public class Dog extends Animal{
	
	public Dog(String breed, int age) {
		super(breed, age);
	}

	public void bark() {
		System.out.println("Dog can Bark......Bow..Boww..!");
	}
}
