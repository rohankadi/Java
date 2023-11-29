//1.Non-Parameterized Constructor
package com.kn.non_parameterized_constructor;

public class Student {
	String name;
	int age;
	
	public void read() {
		System.out.println("Reading a book");
	}
	
	//Printing all information
	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.age);
	}

	
}
