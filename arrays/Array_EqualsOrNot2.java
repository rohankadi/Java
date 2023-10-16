package com.kn.array;

public class Array_EqualsOrNot2 {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30};
		int[] brr = {10, 20, 30};

		boolean result = true;
		//checking the length of both arrays
		if(arr.length == brr.length) {
			for(int i=0; i<arr.length; i++) {
				if(arr[i] != brr[i]) {
					result = false;
				}
			  }
			}
		else { 
			result = false;
		}
		
		if(result==true) {
			System.out.println("Both Arrays are Equals");
		}
		else {
			System.out.println("Both Arrays are not Equals");
		}
	}

}
