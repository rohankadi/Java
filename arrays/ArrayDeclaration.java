package com.kn.arrays;

public class ArrayDeclaration {

	public static void main(String[] args) {
		//Declaration
		int[] arr;
		
		//Creation
		arr = new int[5];
		
		//Initialization
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		
		//Array Traversing
		for(int i=0; i < 5; i++) {
			System.out.println(arr[i]);
		}
	}

}
