package com.kn.javaNumberPrograms;

import java.util.Scanner;

public class ReverseAGivenNumber {

	public static void main(String[] args) {
		// Taking input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to be reversed = ");
		int n = scan.nextInt();

		for (int i = n; n > 0; i--) {
			int r = n % 10;
			System.out.print(r);
			n = n / 10;
		}

		System.out.println("**************************");

		
		
		// or 02
		System.out.println("Enter a another number to be reversed = ");
		int m = scan.nextInt();
		//method calling
		int result = reverseNumber(m);

		System.out.println("Reversed Number : " + result);
		scan.close();
	}

	public static int reverseNumber(int m) {
		int sum = 0;
		int i = m;
		while (m > 0) {
			// for (int i = m; m > 0; i--) {
			int r = m % 10;
			sum = (sum * 10) + r;
			// System.out.print(r);
			m = m / 10;
			i--;
		}
		return sum;
	}

}
