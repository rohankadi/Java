package com.kn.arrays;

public class EvenOrOddElements {

	public static void main(String[] args) {
		// declaration, creation and initialization
		int[] arr = { 34, 98, 77, 49, 52 };

		// Method Calling
		findEvenOrOdd(arr);
	}

	public static void findEvenOrOdd(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i] + "---> Even Number");
			} else {
				System.out.println(arr[i] + "---> Odd Number");
			}
		}

	}

}
