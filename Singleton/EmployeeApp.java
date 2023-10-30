package com.kn.Singleton;

public class EmployeeApp {
public static void main(String[] args) {
	
	Employee e1 = new Employee();
	System.out.println(e1.count);
	
	Employee e2 = new Employee();
	System.out.println(e2.count);
	
	Employee e3 = new Employee();
	System.out.println(e3.count);
		
	Employee e4 = new Employee();
	System.out.println(e4.count);
	
	System.out.println("TOTAL NO OF OBJECTS CREATED :"+ e4.count);
	
}
}
