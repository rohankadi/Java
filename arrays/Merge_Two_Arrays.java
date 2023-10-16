//Given two arrays, the task is to merge or concatenate them and store the result into another array.
package com.kn.array;

import java.util.Scanner;

public class Merge_Two_Arrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Declaration and Creation
//		int[] arr = {10,20,30,40};
//		int[] brr = {100,200,300};
		
		System.out.println("Enter a size1 : ");
		int size1 = scan.nextInt();
		int[] arr = new int[size1];
		System.out.println("Enter a size2 : ");
		int size2 = scan.nextInt();
		int[] brr = new int[size2];
		
		//Initialization
		System.out.println("Enter the data elements = ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
//		for(int i=0; i<brr.length; i++) {
//			brr[i] = scan.nextInt();
//		}
		//or
		for(int i : brr) {    //dataType Variable : Group of data element
			brr[i] = scan.nextInt();
		}
		
		//Method calling
		int[] crr = mergeArray(arr, brr);
		System.out.println("The result of merged Array is as follows : " );
//		for (int i =0; i < crr.length; i++) {
//			System.out.println(crr[i]);
//		}
		//or
		for(int i : crr) {
			System.out.println(i + " ");
		}
	scan.close();
	
	}
	
	
	//Merge Array 
	public static int[] mergeArray(int[] arr, int[] brr) {
		int[] crr = new int[arr.length + brr.length];
		
		for(int i=0; i<arr.length; i++) {
			crr[i] = arr[i];
		}
		
		int j=0;
		for(int i=arr.length; i<crr.length; i++) {
			crr[i] = brr[j];
			j++;
		}
		
		return crr;
	}

	}


