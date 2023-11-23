package com.kn.reversestring;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		//Take input from the user
		Scanner scan  = new Scanner(System.in);
		System.out.println("Enter string to be reversed = ");
		String inputString = scan.nextLine();
		
		//Create object of ReverseString class
		ReverseStringDemo reverseString = new ReverseStringDemo();
		
		//Method in a class to check palindrome or not
		String outputstring = reverseString.reverseString(inputString);
		
		//Print the resultant data
		System.out.println("The reversed string = " + outputstring);
		
		//close the scanner
		scan.close();
	}
}
