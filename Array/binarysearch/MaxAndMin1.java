package com.kn.binarysearch;

public class MaxAndMin1 {

	public static void main(String[] args) {
		int[] arr = { 15, 16, 6, 8, 5 };

		int maximum = -2147483648;
		int minimum = 2147483647;

		// Use to find max and minimum number
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maximum)
			{
				maximum = arr[i];
			} 
			else if (arr[i] < minimum) 
			{
				minimum = arr[i];
			}
		}

		System.out.println("Maximum Value = " + maximum);
		System.out.println("Minimum Value = " + minimum);
	}
}
