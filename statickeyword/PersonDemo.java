package com.kn.statickeyword;

public class PersonDemo {
	//If you want to print something before main method execution then make a use of static block
	static {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		
		System.out.println("World!");
		System.out.println("I'm an " + Person.nationality);
	}
}
