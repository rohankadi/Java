package com.kn.Abstraction;

public class TeacherApp {

	public static void main(String[] args) {
		
	Teacher ref;
	ref = new PhysicsTeacher();
	ref.markAttendance();
	ref.teach();
	ref.doExp();
	
	System.out.println("=======================================");
	
	ref = new ChemistryTeacher();
	ref.markAttendance();
	ref.teach();
	ref.doExp();
	
	System.out.println("=======================================");
	
	ref = new BiologyTeacher();
	ref.markAttendance();
	ref.teach();
	ref.doExp();

	}
}
