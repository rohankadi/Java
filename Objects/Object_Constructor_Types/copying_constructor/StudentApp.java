package com.kn.copying_constructor;

public class StudentApp {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "Rohan";
		s1.age = 23;
		
		s1.printInfo();
		s1.read();
		
		//copying from s1
		Student s2 = new Student(s1);
		s1.read();
		s2.printInfo();
		
	}

}
