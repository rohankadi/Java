package com.kn.statickeyword;

public class Person {
	String name;
	static String nationality;
	
	//If you want to initialize static variable then make a use of  static block
	static {
		nationality = "Indian";
	}
}
