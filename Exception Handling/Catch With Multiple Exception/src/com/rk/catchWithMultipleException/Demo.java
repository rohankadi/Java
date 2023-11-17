package com.rk.catchWithMultipleException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter 02 numbers ");
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = a / b;
			System.out.println(c);

			System.out.println("Enter a Size of an array = ");
			int[] arr = new int[scan.nextInt()];
			System.out.println(arr.length);
		}
		
		//Catch With Multiple Exception
		catch (ArithmeticException | NegativeArraySizeException | InputMismatchException e) {
			System.out.println("Exception Handled");
		}

		catch (Exception e) {
			System.out.println("Some other Exception occured!");
		}

	}

}
