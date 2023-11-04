package com.kn.Abstraction;

public class BiologyTeacher extends Teacher{
	@Override
	void markAttendance() {
		System.out.println("Biology Teacher is marking attendance");
	}
	
	@Override
	void teach() {
		System.out.println("Biology Teacher is teaching...");
	}
	
	@Override
	void doExp() {
		System.out.println("Biology Teacher is doing biology experiment");
	}
}
