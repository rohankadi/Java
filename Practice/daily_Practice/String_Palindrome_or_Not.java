package com.kn.daily_Practice;

import java.util.Scanner;

public class String_Palindrome_or_Not {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a text : ");
		String s1 = scan.next();

		char[] arr = s1.toCharArray();
		String reverse = "";

		scan.close();

		for (int i = arr.length - 1; i >= 0; i--) {
			reverse = reverse + arr[i];
		}
		System.out.println(reverse);

		if (s1.equals(reverse)) {
			System.out.println("PALINDROME");
		} else {
			System.out.println("NOT PALINDROME");
		}
	}
}
