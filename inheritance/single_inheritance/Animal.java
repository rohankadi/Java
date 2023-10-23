package com.kn.single_inheritance;

public class Animal {
	//Attributes
	String breed;
	int age;
	
	//Parameterized constructor
	public Animal(String breed, int age) {
		this.breed = breed;
		this.age = age;
	}

	//Methods
	public void walk() {
		System.out.println("Animal can Walk.......!");
	}
	
	public void waggingTail() {
		System.out.println("Wagging tail.......!");
	}
}
