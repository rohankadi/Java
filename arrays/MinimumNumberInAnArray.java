package com.kn.array;

import java.util.Scanner;

public class MinimumNumberInAnArray {
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
		
		//Initialize the Minimum element
		int  min = arr[0];
		
		//Method calling
		int result = findMinimum_Number(min, arr);
		System.out.println("Minimum(lowest) Element in a given array is '" + result + "'");
		
		scan.close();
	}

	public static int findMinimum_Number(int min, int[] arr) {
		// Traverse array elements from second and compare every element with current min
		for(int  i=1; i<arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
}
