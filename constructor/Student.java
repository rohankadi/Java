package com.kn.constructor;

public class Student {
	String name;
	int age;
	
	//non parameterized constructor
	public Student() {
		
	}
	
	public Student(String name) {
		super();
		this.name = name;
	}
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}
