package com.kn.single_inheritance;

public class Robo {
	String name;
	String type;
	
	public Robo(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	
	public void walk() {
		System.out.println("Robo is walking........");
	}
	public void talk() {
		System.out.println("Robo is talking........");
	}
	public void charge() {
		System.out.println("Robo is charging........");
	}
}
