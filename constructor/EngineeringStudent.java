package com.kn.constructor;

public class EngineeringStudent extends Student{
	String branch;
	int sem;
	
	public EngineeringStudent(String name, int age, String branch, int sem) {
		super(name, age);
		this.branch = branch;
		this.sem = sem;
	}
	
	public EngineeringStudent(String name, int age, int sem) {
		super(name, age);
		this.sem = sem;
	}
	
	public EngineeringStudent(String name, int age, String branch) {
		super(name, age);
		this.branch = branch;
	}
	
	public EngineeringStudent(String name, String branch) {
		super(name);
		this.branch = branch;
	}
	

}
