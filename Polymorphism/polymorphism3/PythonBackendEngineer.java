package com.kn.polymorphism3;

public class PythonBackendEngineer extends BackendEngineer{
	
	@Override
	public void doBackendProject() {
		System.out.println("Python Backend engineer working on Python backend project");
	}
	
	
	// Child special/specific method
		public void learnPython() {
			System.out.println("You can easily learn Python");
		}
}
