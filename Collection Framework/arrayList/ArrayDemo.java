
//PROBLEMS ASSOCIATED WITH ARRAY
package com.rk.arrayList;

public class ArrayDemo {

	public static void main(String[] args) {
		
	int arr[] = new int[3];
	
	arr[0] = 10;
	
	/*
	//1. Arrays can store only homogeneous data
	arr[1] = "Raju";
	arr[2] = 3.147f;
	*/
	
	arr[1] = 20;
	arr[2] = 30;
	/*
	//Index 3 out of bounds for length 3
	//Array cannot grow or shrink in length
	arr[3] = 40;
	arr[4] = 50;
	
	for(int i=0; i<arr.length; i++) {
		System.out.println(arr[i]);
	}
	*/
	
	//Arrays would expect continuous memory
	int[] array = new int[6];
	}
}
