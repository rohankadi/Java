// Write a Java program to compare two strings lexicographically.
//Two strings are lexicographically equal if they are the same length 
//and contain the same characters in the same positions.

package com.kn.StringExercises;

public class CompareTwoStringsLexicographically {

	public static void main(String[] args) {      
		
		String str1 = "This is Excercise 1";
		String str2 = "This is Excercise 2";

		 // Compare the two strings.
        int result = str1.compareTo(str2); //-1
        //System.out.println(result);
        if(result < 0) {
        	System.out.println(str1 + " is less than " + str2);
        }else if(result == 0) {
        	System.out.println(str1 + " is equals to " + str2);
        }else {
        	System.out.println(str1 + " is greater than " + str2);
        	
        }
		
	}

}
