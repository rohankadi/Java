package com.kn.copying_constructor;

public class Student {
	// States
	String name;
	int age;

	// Behavior
	public void read() {
		System.out.println("Reading a Book");
	}

	// printing all information
	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	//for s1
	Student(){
	}
	
	//for s2 Copying constructor
	Student(Student s2){
		this.name = s2.name;
		this.age = s2.age;
	}
}
