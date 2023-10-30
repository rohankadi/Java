package com.kn.Singleton;

public class EmployeeApp1 {
	public static void main(String[] args) {
		
		Employee1 e = Employee1.getObject();
		System.out.println(e.count);
		
		Employee1 e1 = Employee1.getObject();
		System.out.println(e1.count);
		
		Employee1 e2 = Employee1.getObject();
		System.out.println("TOTAL NO OF OBJECTS CREATED : "+ e2.count);
			
	}
}