//Java Program to Check if two Arrays are Equal or not
package com.kn.array;

import java.util.Arrays;

public class Array_EqualsOrNot {

	public static void main(String[] args) {
		// Declaration and Creation and Initialization
		// defining array to compare
		int[] arr = new int[] { 'a', 'b', 'c', 'd', 'e' };
		int[] brr = new int[] { 'a', 'b', 'c', 'f', 'e' };

		// comparing two arrays using equals() method
		if (Arrays.equals(arr, brr))
			System.out.println("Arrays are equal.");
		else
			System.out.println("Arrays are not equal.");
	}

}
