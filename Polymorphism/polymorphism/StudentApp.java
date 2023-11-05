package com.kn.polymorphism;

public class StudentApp {

	public static void main(String[] args) {
		//creating an object
		Student s1 = new Student();
		
		s1.name = "Rohan";
		s1.age = 23;
		
		Student.printInfo(s1.age);
		Student.printInfo(s1.name);
		Student.printInfo(s1.name, s1.age);
		Student.read();
		  //or
		
		//s1.printInfo(s1.age);
		//s1.printInfo(s1.name, s1.age);
		//s1.printInfo(s1.name);
		//s1.read();
		}
}
