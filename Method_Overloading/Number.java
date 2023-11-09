package com.method.overloading;

public class Number {

	public void m1(int i, float f) {
		System.out.println("int-float version");
	}
	
	public void m1(float f, int i) {
		System.out.println("float-int version");
	}
}
