package com.kn.encapsulation;

public class Student {

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", age=" + age + "]";
	}

	private String name;
	private int id;
	private int age;

	// Creating constructor in Setter
	// constructor have a same name as a Class name then, 
	//non return constructor should be called at the time of Object creation
	
	public Student(String a, int b, int c) {
		if (a.length() != 0 && b >= 0 && c >= 20) {
			name = a;
			id = b;
			age = c;
		} else {
			System.out.println("Invalid data.....");
		}
	}

	
	// Getter can be multiple
	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public int getAge() {
		return age;
	}

}
