//Create a new String object with the contents of a character array
package com.kn.StringExercises;

public class StringObjWithCharArray {

	public static void main(String[] args) {
		// Character array with data
		char[] arr = new char[] {'1', '2', '3', '4', '5'};

		// Create a String containing the contents of arr
		// starting at index 1 for length 2.
		//String.copyValueOf(char[] data, int offset, int count)
		String str = String.copyValueOf(arr, 1, 3); 
		
		// Display the results of the new String
		 System.out.println("The book contains '" + str +"' pages");
	}
}
