package com.kn.Abstraction;

public class PhysicsTeacher extends Teacher {
	@Override
	void markAttendance() {
		System.out.println("Physics Teacher is marking attendance");
	}
	
	@Override
	void teach() {
		System.out.println("Physics Teacher is teaching...");
	}
	
	@Override
	void doExp() {
		System.out.println("Physics Teacher is doing Laws experiment");
	}
}
