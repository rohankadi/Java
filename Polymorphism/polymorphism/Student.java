package com.kn.polymorphism;

public class Student {
	// States
	String name;
	int age;

	// Behavior
	public static void read() {
		System.out.println("Reading a Book");
	}
	
	//Polymorphism ==> poly(many), morphism(forms)
	/*
	 * 02types =>
	 1.compile-time polymorphism => by Method Overloading or operation overloading
	 2.run-time polymorphism
	 */
	
	//01 method Overloading
	public static  void printInfo(String name) {
		System.out.println(name);
	}

	public static  void printInfo(int age) {
		System.out.println(age);
	}
	
	public static void printInfo(String name, int age) {
		System.out.println(name +  " " + age);
	}
}
