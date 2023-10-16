package com.kn.array;

public class Array_EqualsOrNot1 {
	public static void main(String[] args) {

		int[] arr = { 10, 20, 30 };
		int[] brr = { 10, 20, 30 };

		boolean result = false;

		// checking the length of both arrays
		if (arr.length == brr.length) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == brr[i]) {
					result = true;
				}
			}
		} else {
			result = true;
		}

		if (result == true) {
			System.out.println("Both Arrays are Equals");
		} else {
			System.out.println("Both Arrays are not Equals");
		}
	}
}
