package com.kn.basicPrograms;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number is to be checked = ");
		int n = scan.nextInt();
		int r, temp = n, sum = 0;
		
		
		for(int i = n; n > 0; i--)
		{
		    r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
	}
		if(sum == temp) {
			System.out.println(temp +" is Palindrome");
		}
		else {
			System.out.println(temp + " is not Palindrome");
		}
		scan.close();

	}

}
