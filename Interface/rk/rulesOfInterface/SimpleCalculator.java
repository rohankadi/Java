	package com.rk.rulesOfInterface;

import java.util.Scanner;

public class SimpleCalculator implements Calculator {
	private Scanner scan = new Scanner(System.in);
	
	@Override
	public void add() {
		System.out.println("Enter 02 numbers for Addition ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("Simple Addition is "+ (a+b));
	}

	@Override
	public void sub() {
		System.out.println("Enter 02 numbers for Subtraction ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("Simple Subtraction is "+ (a-b));
	}

	@Override
	public void mul() {
		System.out.println("Enter 02 numbers for Multiplication ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("Simple Multiplication is "+ (a*b));
	}

	@Override
	public void div() {
		System.out.println("Enter 02 numbers for Division ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("Simple Division is "+ (a/b));
	}

}
