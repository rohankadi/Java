package com.kn.objects;

public class Student {
 
	int id;
	String name;
	int marks;
	
	void study() {
		System.out.println("Studying 5 hours");
	}

	public Student(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	
	
}
