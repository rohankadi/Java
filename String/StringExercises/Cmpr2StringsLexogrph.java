//Compare two strings lexicographically, ignoring case differences
package com.kn.StringExercises;

public class Cmpr2StringsLexogrph {

	public static void main(String[] args) {
		/*
		The compareToIgnoreCase() method compares two strings lexicographically,
		ignoring lower case and upper case differences.

       The comparison is based on the UniCode value of each character 
		in the string converted to lower case.
		*/
		
		String str1 = "This is exercise 1";
		String str2 = "This is EXERCISE 1";
		
		 // Compare the two strings by ignoring it's case
		int result = str1.compareToIgnoreCase(str2);
		
		if(result < 0) {
        	System.out.println(str1 + " is less than " + str2);
        }else if(result == 0) {
        	System.out.println(str1 + " is equals to " + str2);
        }else {
        	System.out.println(str1 + " is greater than " + str2);
        	
        }

	}

}
