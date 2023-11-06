package com.kn.polymorphism3;

public class DatabaseEngineer extends SoftwareEngineer {
	
	@Override
	public void attendMeeting() {
		System.out.println("Database engineer attends Database meeting");
	}
	
	public void doDatabaseProject() {
		System.out.println("DataBase engineer working on DataBase project");
	}
	
	//Child special/specific method
	public void learnSQL() {
		System.out.println("You can easily learn SQL");
	}
}
