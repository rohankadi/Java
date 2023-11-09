package com.kn.statickeyword;

public class DemoApp {

	public static void main(String[] args) {
		//We can call static methods without creating an object, by it's Class name
		Demo.display1();
		
		//Creating object for instance methods
		Demo d = new Demo();
		d.display2();
		
	}
}
