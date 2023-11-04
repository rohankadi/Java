package com.kn.Abstraction;

public class ChemistryTeacher extends Teacher {
	@Override
	void markAttendance() {
		System.out.println("Chemistry Teacher is marking attendance");
	}
	
	@Override
	void teach() {
		System.out.println("Chemistry Teacher is teaching...");
	}
	
	@Override
	void doExp() {
		System.out.println("Chemistry Teacher is doing chemistry experiment");
	}
}
