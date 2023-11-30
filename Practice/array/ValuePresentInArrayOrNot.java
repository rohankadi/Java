//Check if a value is present in an Array in Java
package com.kn.array;

import java.util.Scanner;

public class ValuePresentInArrayOrNot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Declaration and creation
		System.out.print("Enter the Size of an Array = ");
		int[] arr = new int[scan.nextInt()];

		// Initialization
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter the integer data for the element " + (i + 1) + " : ");
			arr[i] = scan.nextInt();
		}

		// The element to be found
		System.out.print("Enter the Element to be found = ");
		int ele = scan.nextInt();
		
		//Method calling
		boolean result = isPresentInArrayOrNot(ele, arr);
		if (result) {
			System.out.println("The Element " + ele + " found in an array");
		} else {
			System.out.println("The Element " + ele + " is not found in an array");
		}
		scan.close();

	}
	
	//Method declaration to Check if a value is present in an Array in Java
	public static boolean isPresentInArrayOrNot(int ele, int[] arr) {
		// Array Traversing
		for (int i = 0; i < arr.length; i++) {
			if (ele == arr[i]) {
				return true;
			}
		}
		return false;

	}

}
