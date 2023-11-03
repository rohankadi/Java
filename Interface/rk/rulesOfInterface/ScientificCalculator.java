package com.rk.rulesOfInterface;

import java.util.Scanner;

public class ScientificCalculator implements Calculator {
	private Scanner scan = new Scanner(System.in);

	@Override
	public void add() {
		System.out.println("Enter 02 numbers for Addition ");
		int a = scan.nextInt();
		int b = scan.nextInt();

		if (a == 0 || b == 0) {
			System.out.println("Go to LKG...!");
		} else {
			System.out.println("Scientific Addition is " + (a + b));

		}
	}

	@Override
	public void sub() {
		System.out.println("Enter 02 numbers for Subtraction ");
		int a = scan.nextInt();
		int b = scan.nextInt();

		if (a == 0 || b == 0) {
			System.out.println("Go to LKG...!");
		} else {
			System.out.println("Scientific Subtraction is " + (a - b));
		}
	}

	@Override
	public void mul() {
		System.out.println("Enter 02 numbers for Multiplication ");
		int a = scan.nextInt();
		int b = scan.nextInt();

		if (a == 0 || b == 0) {
			System.out.println("Go to LKG...!");
		} else {
			System.out.println("Scientific Multiplication is " + (a * b));
		}
	}

	@Override
	public void div() {
		System.out.println("Enter 02 numbers for Division ");
		int a = scan.nextInt();
		int b = scan.nextInt();

		if (b == 0) {
			System.out.println("Go to LKG...!");
		} else {
			System.out.println("Scientific Division is " + (a / b));
		}
	}
  }
