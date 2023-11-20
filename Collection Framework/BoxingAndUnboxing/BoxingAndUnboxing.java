package com.rk.BoxingAndUnboxing;

public class BoxingAndUnboxing {

	public static void main(String[] args) {

		// ******************* BOXING *********************

		// CONVERTING PRIMITIVE DATATYPE TO AN OBJECTS

		// x is int type variable holding integer type value 10
		int x = 10;

		// Integer type of object
		// y is holding integer type of address
		Integer y = new Integer(100);

		y = x; // BOXING(auto) //internally converted to ==> y = new Integer(10);
		System.out.println(y);
		
		y = (int) x; //BOXING(explicit/manually)
		System.out.println(y);
		
		// ******************* UNBOXING *********************

		// CONVERTING OBJECTS TO PRIMITIVE DATATYPE
		Integer a = new Integer(100);
		
		int b;
		
		b = a; //UNBOXING(auto)
		System.out.println(b);
		
		b = a.intValue(); //UNBOXING(explicit/manually)
		System.out.println(b);
		
		
		
		
	}

}
