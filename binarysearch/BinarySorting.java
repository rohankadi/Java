package com.kn.binarysearch;

public class BinarySorting {

	public static void main(String[] args) {
		//Decalaration, creation and Initialization
		int[] arr = {15, 16, 6, 8, 5};
		
		
		//Printing elements Before sorting
		System.out.println("Before Sorting");
		for(int i : arr) {
			System.out.print(i + " ");
		}
		//bubble sorting
		for(int i=0; i<arr.length; i++) 
		{
			
			for(int j=0; j<arr.length-1-i ; j++)
			{
				int temp = 0;
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
				}
				
			}
		}
		
		System.out.println();
		System.out.println("After sorting : ");
		for(int i : arr) {
			System.out.print(i + " ");
		}

	}

}
