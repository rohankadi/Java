package com.kn.javaNumberPrograms;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a first number = ");
		int num1 = scan.nextInt();
		System.out.println("Enter a second number = ");
		int num2 = scan.nextInt();
		
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("first number : " + num1);
		System.out.println("second number : " + num2);
		
		scan.close();
	}

}
