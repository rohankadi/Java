package com.kn.parameterized_constructor;

public class Student {
	//States	
	String name;
	int age;
	
	//Behavior
	public void read() {
		System.out.println("Reading a Book");
	}
	
	//printing all information
	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	//Parameterized_constructor
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	
}
