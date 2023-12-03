package com.kn.NeonNumber;

import java.util.Scanner;

public class Neon_NumberOrNot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number to check: ");
		// reading a number from the user
		int num = scan.nextInt(); // assume input taken as '9'

		neonNumber(num);	
		scan.close();
	}

	//Method to check whether number is neon or not
	public static void neonNumber(int num) {
		int r, sum = 0, square;
		int temp = num;
		// squaring the number to be checked
		square = num * num;

		while (square > 0) {
		 // Step 1: Find remainder
			r = square % 10;
		// Add remainder to the current sum
			sum = sum + r;
		// Drop last digit of the product and store the number
			square = square / 10;
		}
		
		if (temp == sum) {
			System.out.println(temp + " IS NEON NUMBER ");
		}
		else {
			System.out.println(temp + " IS NOT NEON NUMBER ");
		}
		
	}
}
