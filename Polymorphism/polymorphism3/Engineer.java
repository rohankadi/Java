package com.kn.polymorphism3;

public class Engineer {
	public void enggSameTasks(SoftwareEngineer se) {
		se.attendMeeting();
		se.writeTestCases();
	}
	
	public void backendSameTasks(BackendEngineer be) {
		be.doBackendProject();
	}
}
