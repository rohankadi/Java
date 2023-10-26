package com.object.typeCasting;

public class Var_TypeCastDemo {
	public static void main(String[] args) {
	// Creating an Object
	Variable_Typecasting_C c = new Variable_Typecasting_C();
	//Method resolution taken care by compiler based on reference type.
	//C 
	System.out.println(c.x); //999
	
	//C converting to B
	System.out.println(((Variable_Typecasting_B)(c)).x); //888
	
	//C converting to B and B converting to A
	System.out.println(((Variable_Typecasting_A)(Variable_Typecasting_B)(c)).x); //777
	
	}
}
