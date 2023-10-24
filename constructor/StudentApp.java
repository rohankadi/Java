package com.kn.constructor;

public class StudentApp {

	public static void main(String[] args) {
		EngineeringStudent e1 = new EngineeringStudent("Rohan", 23, "Mechanical", 8);
		System.out.println("Name = " + e1.name + ", Age = " + e1.age + ", Branch = " + e1.branch 
				+ ", Sem = " + e1.sem);

		EngineeringStudent e2 = new EngineeringStudent("Rohan", 23, "Mechanical", 8);
		System.out.println("Name = " + e2.name + ", Age = " + e2.age + ", Sem = " + e2.sem);
	
	}
}
