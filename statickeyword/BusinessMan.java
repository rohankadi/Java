package com.kn.statickeyword;

import java.util.Scanner;

public class BusinessMan {

	int p;
	int t;
	static float r;
	//static float r = 0.2f;
	float si;
	
	//static block (which is same value for all objects)
	static {
		r = 0.2f;
	}
	
	Scanner scan = new Scanner(System.in);
	
	public void collectInputs(){
		System.out.println("Enter P : ");
		p = scan.nextInt();
		System.out.println("Enter T : ");
		t = scan.nextInt();
//		System.out.println("Enter R : ");
//		r = scan.nextFloat();	
	}
	
	public void simpleInterest() {
		si = (p*t*r) / 100;
	}
	
	public void displaySI() {
		System.out.println("SIMPLE INTEREST IS : " + si);
	}
}
