package com.kn.arrays;

public class ArrayElementSum {

	public static void main(String[] args) {
		// Declaration and Creation
		int[] arr = new int[5];
		// initialization
//		arr[0] = 34;
//		arr[1] = 75;
//		arr[2] = 3;
//		arr[3] = 48;
//		arr[4] = 99;

		int k = 10;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = k;
			System.out.println(k);
			k = k + 10;
		}

		// Method Calling
		int sum = findArrayElementSum(arr);
		System.out.println("The Sum is = " + sum);
	}

	// Method
	// 01
	/*
	 * int sum = 0;
	 *  for(int i=0; i<arr.length; i++)
	 *   { 
	 *   sum += arr[i]; }
	 * System.out.println("The total sum is = " + sum);
	 */

	// 02
	public static int findArrayElementSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
