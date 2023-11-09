package com.method.overloading;

public class NumberDemo {

	public static void main(String[] args) {
		
		Number n = new Number();
		
		n.m1(10, 10.5f); //int-float version
		n.m1(10.5f, 10); //float-int version

		//reference to m1 is ambiguous => The method m1(int, float) is ambiguous for the type Number
		//n.m1(10, 10); //cz, both method get matched
		
		/*
		 * int to float conversion is there bt not float to int conversion
		 * 
		 * No method matched (possible lossy conversion from float to int) ===>
		   The method m1(float, int) in the type Number is not applicable for the arguments
		(float, float)
		 * */
	
		// n.m1(10.5f, 10.5f);
	}

}
