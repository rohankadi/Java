//Java program to Remove duplicates from Sorted Array
package com.kn.array;

public class Remove_DuplicatesFromSortedArray {

	// Driver code
	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 3, 4, 4, 4, 5, 5, 6};

		//Method calling
		int result = removeDuplicate(arr);
		
		//Traversing to print a result
		for(int i=0; i<result; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

	//method declaration
	public static int removeDuplicate(int[] arr) {
		
		int rd = 0;
		
		for(int i=1; i<arr.length; i++) {
			if(arr[rd] != arr[i]) {
				rd++;
			   arr[rd] = arr[i];
			}
		}
		return rd+1;
	}
	
	/*  //or 
	 public static int removeDuplicate(int[] arr) {
		
		int j = 0;
		
		for(int i=1; i<arr.length; i++) {
			if(arr[j] != arr[i]) {
				rd++;
			   arr[j] = arr[i];
			}
		}
		return j+1;
	}
	 */
}
