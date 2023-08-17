//2nd Largest num
package com.kn.binarysearch;

import java.util.Scanner;

public class MaxandMin2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Decalaration and Creation
				System.out.print("Enter the Size of an array = ");
				int size = scan.nextInt();
				int[] arr = new int[size];

				// Initialization
				for (int i = 0; i < arr.length; i++) {
					System.out.print("Enter the data for element " + (i + 1) + " : ");
					arr[i] = scan.nextInt();
				}

				System.out.println("===========================================");

				toFindTheSecLargestElem(arr);
		scan.close();
		}

	public static void toFindTheSecLargestElem(int[] arr) {
		//Array Traversing
		int large = -2147483648, seclarge = -2147483648;
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				if(arr[i] > large) 
				{
					large = arr[i];
				}
				if(arr[i] < large && arr[i] > seclarge) 
				{
					seclarge = arr[i];
				}
			}
		}
		System.out.println("The Second Largest Element in the array = " + seclarge);
	}

}
