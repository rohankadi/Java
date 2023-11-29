package com.kn.gcd;

import java.util.Scanner;

public class GreatestCommonDivisorOf2Num {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number1= ");
	int n1 = scan.nextInt();
	System.out.println("Enter a number2= ");
	int n2 = scan.nextInt();
	
	//create a object
	GcdOfTwoNum g1 = new GcdOfTwoNum();
	int result = g1.gcd(n1,n2);
	
	System.out.println("The gcd of 2 num is = " + result);
	
	scan.close();

	}

}
