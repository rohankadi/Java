package com.kn.polymorphism3;

public class JavaBackendEngg extends BackendEngineer{
	
	@Override
	public void doBackendProject() {
		System.out.println("Java Backend engineer working on Java backend project");
	}
		
	// Child special/specific method
	public void learnJava() {
		System.out.println("You can easily learn Java");
	}
}
