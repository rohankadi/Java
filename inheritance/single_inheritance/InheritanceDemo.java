package com.kn.single_inheritance;

public class InheritanceDemo {

	public static void main(String[] args) {
		
		ChefRobo robo1 = new ChefRobo("Chitti", "v2.0");
		
		System.out.println("Name = " + robo1.name + ", Type = " + robo1.type);
		robo1.walk();
		robo1.talk();
		robo1.charge();
		robo1.cook();
		
		System.out.println("**********************");
	
		DriverRobo robo2 = new DriverRobo("Pavan", "v10");
		System.out.println("Name = " + robo2.name + ", Type = " + robo2.type);
		robo2.walk();
		robo2.talk();
		robo2.charge();
		robo2.drive();
		
		System.out.println("**********************");
		
		TeacherRobo robo3 = new TeacherRobo("Ravan", "v15.2");
		System.out.println("Name = " + robo3.name + ", Type = " + robo3.type);
		robo3.walk();
		robo3.talk();
		robo3.charge();
		robo3.teach();	
	}

}
