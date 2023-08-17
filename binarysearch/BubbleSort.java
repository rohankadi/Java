package com.kn.binarysearch;

public class BubbleSort {

	public static void main(String[] args) {
		int [] arr = {32, 48, 22, 69, 5, 21};
		
		System.out.println("Before Sorting : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		BubbleSortDemo bubble1 = new BubbleSortDemo();
		int[] brr = bubble1.behaviour(arr);
		System.out.println();
		System.out.println("Sorted Array is : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(brr[i] + " ");
		}

	}

}
