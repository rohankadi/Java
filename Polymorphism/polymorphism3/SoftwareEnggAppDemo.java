package com.kn.polymorphism3;

public class SoftwareEnggAppDemo {
	public static void main(String[] args) {
		SoftwareEngineer se;
		
		Engineer e = new Engineer();
			
		System.out.println("***********************");
		
		BackendEngineer be = new BackendEngineer();
//		be.attendMeeting();
//		be.writeTestCases();
//		((BackendEngineer)(be)).doBackendProject();
		
		e.enggSameTasks(be);
		e.backendSameTasks(be);
		
		System.out.println("***********************");
		
		DatabaseEngineer de = new DatabaseEngineer();
//		de.attendMeeting();
//		de.writeTestCases();
//		((DatabaseEngineer)(de)).doDataBaseProject();
		((DatabaseEngineer)(de)).learnSQL();
		
		e.enggSameTasks(de);
		e.backendSameTasks(be);
		
		System.out.println("***********************");
		
		se = new JavaBackendEngg();
//		se.attendMeeting();
//		se.writeTestCases();
		((JavaBackendEngg)(se)).learnJava();
		
		e.enggSameTasks(se);
//		((JavaBackendEngg)(se)).doBackendProject();
		//or
		e.backendSameTasks(be);
		
		System.out.println("***********************");
		
		se = new PythonBackendEngineer();
//		se.attendMeeting();
//		se.writeTestCases();
		((PythonBackendEngineer)(se)).learnPython();	
		
		e.enggSameTasks(se);
		//((PythonBackendEngineer)(se)).doBackendProject();
		//or
		e.backendSameTasks(be);
	}
}
