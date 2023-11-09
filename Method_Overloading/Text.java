package com.method.overloading;

public class Text {
	
	public void m1(String s) {
		System.out.println("String Version");
	}
	
	public void m1(StringBuffer sb) {
		System.out.println("String Buffer Version");
	}
}
