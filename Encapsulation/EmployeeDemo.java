package com.kn.encapsulation;

public class EmployeeDemo{
	public static void main(String[] args) {

		Employee e = new Employee(23, "Rohan");
		System.out.println(e.getId() + " " + e.getName());
		
		Employee e2 = new Employee();
		System.out.println(e2.getId() + " " + e2.getName());
		
		
		Employee e3 = new Employee("Rohan");
		System.out.println(e3.getId() + " " + e3.getName());
		
		
	}
}
