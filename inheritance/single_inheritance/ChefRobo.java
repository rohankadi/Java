package com.kn.single_inheritance;

public class ChefRobo extends Robo {
	/*
	String name;
	String type;
	
	public ChefRobo(String name, String type) {
		super(name, type);
		this.name = name;
		this.type = type;
	}
	*/

	public ChefRobo(String name, String type) {
		super(name, type);
	}

	public void cook() {
		System.out.println("ChefRobo is cooking........");
	}
}
