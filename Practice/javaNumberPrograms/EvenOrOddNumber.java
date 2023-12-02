package com.kn.javaNumberPrograms;

import java.util.Scanner;

public class EvenOrOddNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int num = scan.nextInt();
		scan.close();
		
		if(num % 2 == 0) 
		{
			System.out.println(num + " is Even Number");
		}
		else 
		{
			System.out.println(num + " is Odd Number");
		}
	}

}
