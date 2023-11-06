package com.kn.polymorphism3;

public class BackendEngineer extends SoftwareEngineer {	
	
	//overridden method
	@Override
	public void attendMeeting() {
		System.out.println("Backend Engineer attends Backend meeting");
	}
	
	//Child special/specific method
	public void doBackendProject() {
		System.out.println("Backend engineer working on backend project");
	}
}
