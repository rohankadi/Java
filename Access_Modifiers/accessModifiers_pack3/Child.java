package com.kn.accessModifiers_pack3;

public class Child extends Parent {

	@Override
	public void eyeColor() {
//		super.eyeColor();
		System.out.println("Brown");
	}

	@Override
	public void weight() {
//		super.weight();
		System.out.println(50);
	}
	
	//child special/specific methods
	public void insta() {
		System.out.println("Keep on Scrolling......!");
	}
	
	public void pubg() {
		System.out.println("Keep on Shooting.......!");
	}
}
