package com.kn.arrays;

public class EvenOddElements {

	public static void main(String[] args) {
		//Declaration and Creation
		int[] arr = new int[5];
		//Initialization
		int k = 5;
		for(int i=0; i<arr.length; i++) {
			arr[i] = k;
			k = k + 5 ;
		}
		
		//Method   
		 findingTheEvenOrOdd(arr);
	}
       
	//Method Declaration for finding given num is even or odd
	public static void findingTheEvenOrOdd(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 ==0) {
				System.out.println(arr[i] + "--> Even");
			}
			else {
				System.out.println(arr[i] + "--> Odd");
			}
		}  
		
	}

}
