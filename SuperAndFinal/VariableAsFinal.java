package com.rk.SuperAndFinal;

public class VariableAsFinal {
 public static void main(String[] args) {

		final int a = 10;
		System.out.println(a);
		
		/*
		//ERROR : The final local variable a cannot be assigned. It must be blank 
		a = 20;
		System.out.println(a);
 		*/
 }
}
