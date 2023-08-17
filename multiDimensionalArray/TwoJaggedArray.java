package com.kn.multiDimensionalArray;

public class TwoJaggedArray {

	public static void main(String[] args) {
		// Array Declaration and Creation
		int[][] arr = new int [2][]; //2 is Base Size its mandatory, it should not be empty.
		arr[0] = new int[4];
		arr[1] = new int[2];
		
		//Array Initialization
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		arr[0][3] = 40;
		arr[1][0] = 50;
		arr[1][1] = 60;
		
		
		System.out.println("**********************");
		//Array Traversing
//		System.out.println(arr[0][0]);
//		System.out.println(arr[0][1]);
//		System.out.println(arr[0][2]);
//		System.out.println(arr[0][3]);
//		System.out.println(arr[1][0]);
//		System.out.println(arr[1][1]);
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}

}
