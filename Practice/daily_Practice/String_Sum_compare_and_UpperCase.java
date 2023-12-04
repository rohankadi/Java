package com.kn.daily_Practice;

import java.util.Scanner;

public class String_Sum_compare_and_UpperCase {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word : ");
		String A = sc.next();
		String B = sc.next();
		//01. Sum of length of 2-Strings
		System.out.println(A.length() + B.length());
		
		//02. Determine if A is lexicographically larger than B
		//(i.e.: does  come before  in the dictionary?).
		
		System.out.println(((A.compareTo(B)) < 0 ? "Yes" : "No"));
		//or
//		if(A.compareTo(B) < 0) {
//			System.out.println("No");
//		}else {
//			System.out.println("Yes");
//		}
		
		//03. Capitalize the first letter in A and B and 
		//print them on a single line, separated by a space.
		
		System.out.println(Character.toUpperCase(A.charAt(0))+ A.substring(1)+ " "
				+ Character.toUpperCase(B.charAt(0)) + B.substring(1));
		
	sc.close();
	}
}
