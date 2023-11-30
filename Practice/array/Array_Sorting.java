package com.kn.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Sorting {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Declaration and Creation
		System.out.print("Enter a Size of an Array = ");
		int[] arr = new int[scan.nextInt()];

		// Initialization
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter a array Element " + (i + 1) + " : ");
			arr[i] = scan.nextInt();
		}

		// Before Sorting
		System.out.print("Before Sorting : ");
		for (int n : arr) {
			System.out.print(n + " ");
		}

		// Sorting
		Arrays.sort(arr);

		System.out.println();

		System.out.print("After Sorting : ");
		// After Sorting
		for (int num : arr) { // (DataType VariableName : Group of Elements)
			System.out.print(num + " ");
		}
		scan.close();
	}
}
