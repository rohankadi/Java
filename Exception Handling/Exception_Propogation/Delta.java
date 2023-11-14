package com.rk.Exception_Propogation;

public class Delta {

	public static void main(String[] args) {
		
		Gamma gamma = new Gamma();
		gamma.project2();
		
	}
}


/*
 //There is no USER EXCEPTION HANDLER so, control will go to DEFAULT EXCEPTION HANDLER
OUTPUT : 01
Connection Established
Enter 02 numbers : 
20
0
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at com.rk.Exception_Propogation.Alpha.division(Alpha.java:13)
	at com.rk.Exception_Propogation.Beta.procedure1(Beta.java:8)
	at com.rk.Exception_Propogation.Gamma.project2(Gamma.java:8)
	at com.rk.Exception_Propogation.Delta.main(Delta.java:8)
*/