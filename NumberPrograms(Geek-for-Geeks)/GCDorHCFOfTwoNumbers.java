package com.kn.javaNumberPrograms;

public class GCDorHCFOfTwoNumbers {

	public static void main(String[] args) {
		int a = 9;
		int b = 21;
      
	int result = gcdOfTwoNumer(a,b);
	System.out.println("Gretest Common divisor of " + a + " and " + b + " is = "+ result);
		
	}

	public static int gcdOfTwoNumer(int a, int b) {
		if(a == 0) {
			return b;
		}
		return gcdOfTwoNumer(b%a, a);
	}
}
