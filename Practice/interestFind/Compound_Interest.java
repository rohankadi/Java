package com.kn.interestFind;

import java.util.Scanner;

public class Compound_Interest {

	public static void main(String[] args) {
		// Compound Interest = P(1 + R/100)t
		// Where,
		// P is principal amount
		// R is the rate and
		// T is the time span

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the principal amount (P) = ");
		double p = scan.nextDouble();
		System.out.print("Enter the given time (T) = ");
		double t = scan.nextDouble();
		System.out.print("Enter the rate (R) = ");
		double r = scan.nextDouble();
		
		
		double result = compoundInterest(p, t, r);
		System.out.println(result);
		scan.close();
	}

	public static double compoundInterest(double p, double t, double r) {
		double compound_interest = p * Math.pow((1 + r / 100), t);
		return compound_interest;
	}

}
