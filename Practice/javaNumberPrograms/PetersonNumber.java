package com.kn.javaNumberPrograms;

import java.util.Scanner;

public class PetersonNumber {
	// checks whether a number entered by user is peterson number or not
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// taking input from the user
		System.out.print("Enter the number = ");
		int num = sc.nextInt();
		int temp = num;// storing the number in a temporary variable
		int f = 1, sum = 0;
		
		sc.close();
		
		
		while (num > 0)// running while loop until number becomes zero
		{
			f = 1;
			// extracting last digit of the number
			// and storing in r
			int r = num % 10;
			// for loop to find the factorial of a digit
			for (int i = 1; i <= r; i++) {
				f = f * i;
			}
			sum = sum + f;// adding the factotial of the digits
			num = num / 10;
		}
		
		// checking if the sum of the factorial of digits
		// is equal to the number or not
		if (sum == temp)
			System.out.println(temp + " IS PETERSON NUMBER");
		else
			System.out.println(temp + " IS NOT PETERSON NUMBER");
	}
}