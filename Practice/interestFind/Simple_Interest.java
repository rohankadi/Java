package com.kn.interestFind;

import java.util.Scanner;

public class Simple_Interest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the principal amount (P) = ");
		int p = scan.nextInt();
		System.out.print("Enter the given time (T) = ");
		int t = scan.nextInt();
		System.out.print("Enter the rate (R) = ");
		int r = scan.nextInt();
		
		int result = simpleInterest(p,t,r);
		System.out.println("The Simple interest on " + p + "/- at the rate of " + r + "% for "
		+ t + " units of time is = "+ result + " ");
		scan.close();
	}

	public static int simpleInterest(int p, int t, int r) {
		int interest = (p*t*r)/100;
		return interest;
	}

}
