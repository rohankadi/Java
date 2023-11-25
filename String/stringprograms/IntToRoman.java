package com.kn.stringprograms;

import java.util.Scanner;

public class IntToRoman {

	public static void main(String[] args) {
		String[] srr = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		int[] arr = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number = ");
		int number = scan.nextInt();

		StringBuffer romanNumber = new StringBuffer();

		for (int i = 0; i < arr.length; i++) 
		
		{
//			if (arr.length == srr.length) {

				while (number >= arr[i]) {
					number = number - arr[i];
					romanNumber.append(srr[i]);
				}
			}
//		}

		System.out.println(romanNumber);
       scan.close();
	}

}
