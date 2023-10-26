package com.object.typeCasting;

public class InternalThing_ObjTypeCasting {

	public static void main(String[] args) {
		//Object creation          
		Integer i = new Integer(10);
		
		//Integer child of Number typecasting is done
		Number n = (Number) i;
//		System.out.println(n);
		
		//Number is child of Object
		Object o = (Object) n;
//		System.out.println(o);
		
		
		//clarification whether true or false
		
		System.out.println(i == n); //true
		System.out.println(n == o); //true
		System.out.println(o == i); //true
		
		// reference type will changes but, runtime object remains same
	}
}
