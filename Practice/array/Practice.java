package com.kn.array;

public class Practice {
	public static void main(String[] args) {
		// merge 2arrays
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] brr = { 10, 20, 30, 40, 50 };
		int[] crr = new int[arr.length + brr.length];

		merge2Arrays(arr, brr, crr);
	}

	public static void merge2Arrays(int[] arr, int[] brr, int[]crr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=arr.length-1; j<crr.length; j++) {
				crr[i] = arr[i] + brr[i];
				System.out.println(crr[i]);
			}
		}
	}
}
