package com.method.overloading;

public class TextDemo {

	public static void main(String[] args) {
		Text t = new Text();
		t.m1("Durga");
		t.m1(new StringBuffer("Durga"));
		System.out.println("-------------------------------");
		
		//Error : The method m1(String) is ambiguous for the type Text
		//t.m1(null);
	}
}
