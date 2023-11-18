package com.kn.non_parameterized_constructor;

public class StudentApp {

	public static void main(String[] args) {
	Student s1 = new Student(); //==>Student() -->It is a Non parameterized constructor, 
					//which not returns anything, and same as Class name.
	
	s1.name = "Rohan";
	s1.age = 23;
	
	//System.out.println("name = " + s1.name + ", age = " + s1.age);
	s1.read(); //Behavior
	
	s1.printInfo();
	
	}

}
