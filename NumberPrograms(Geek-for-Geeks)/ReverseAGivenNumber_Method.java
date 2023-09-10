package com.kn.javaNumberPrograms;

import java.util.Scanner;

public class ReverseAGivenNumber_Method {

	public static void main(String[] args) {
		// Taking input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to be reversed = ");
		int num = scan.nextInt();

		reverseNumber(num);
	

	}

	public static int reverseNumber(int num) {
		for (int i = num; num > 0; i--) {
			int r = num % 10;
			System.out.print(r);
			num = num / 10;
		}
		return num;
	}

}
