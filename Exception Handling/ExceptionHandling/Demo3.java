//Multiple try, multiple catches
package com.rk.ExceptionHandling;

import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {

		try {
			System.out.println("Connection Established");
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter 02 numbers : ");
			int a = scan.nextInt();
			int b = scan.nextInt();
			// error may occur in below line during runtime execution coz, of faulty i/p
			// given by the user
			int c = a / b;
			// if error occur at above line then Code terminates that point only,
			// further execution will not there.
			System.out.println(c);
			scan.close();
		}

		catch (ArithmeticException e) {
			System.out.println("Exception : ArithmeticException : / by 0");
		}

		catch (NegativeArraySizeException e) {
			System.out.println("Exception : NegativeArraySizeException enter positive array");
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception : ArrayIndexOutOfBoundsException be in your array size limit");
		}

		catch (Exception e) {
			System.out.println("Some other problem occured...Technical issue");
		}

		System.out.println("***************************************************");

		try {
			Scanner scan = new Scanner(System.in);
			// Creating an array
			System.out.println("Enter length of an array");
			int[] arr = new int[scan.nextInt()];

			System.out.println("Enter an Integer element to insert into array");
			int elem = scan.nextInt();

			System.out.println("Enter Index position to an array");
			int pos = scan.nextInt();

			arr[pos] = elem;
			System.out.println("Element present at position " + pos + " is " + arr[pos]);

			scan.close();
		}

		catch (NegativeArraySizeException e) {
			System.out.println("Exception : NegativeArraySizeException enter positive array");
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception : ArrayIndexOutOfBoundsException be in your array size limit");
		}

		catch (Exception e) {
			System.out.println("Some other problem occured...Technical issue");
		}
	}
}
