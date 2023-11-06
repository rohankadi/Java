package com.kn.polymorphism3;

public class SoftwareEnggAppDemo1 {
	public static void main(String[] args) {
		SoftwareEngineer se1 = new SoftwareEngineer();
		BackendEngineer be1 = new BackendEngineer();
		DatabaseEngineer de1 = new DatabaseEngineer();
		JavaBackendEngg je1 = new JavaBackendEngg();
		
		
		doActivity(se1);
	}
	

	public static void doActivity(SoftwareEngineer se1) {
		se1.attendMeeting();
		se1.writeTestCases();
		
		if (se1 instanceof JavaBackendEngg) {
			System.out.println("-----------> Java Backend Engg");
			((JavaBackendEngg)(se1)).doBackendProject();
			((JavaBackendEngg)(se1)).learnJava();
		}
		
		else if(se1 instanceof PythonBackendEngineer) {
			System.out.println("-----------> Python Backend Engg");
			((PythonBackendEngineer)(se1)).doBackendProject();
			((PythonBackendEngineer)(se1)).learnPython();
		}
		else if(se1 instanceof DatabaseEngineer) {
			System.out.println("-----------> Python Backend Engg");
			((DatabaseEngineer)(se1)).doDatabaseProject();
			((DatabaseEngineer)(se1)).learnSQL();
		}
		else if(se1 instanceof BackendEngineer) {
			((BackendEngineer) se1).doBackendProject();
		}
		
	}
}
