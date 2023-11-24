//Write a Java program to get the character 
//(UniCode code point) at the given index within the string.
package com.kn.StringExercises;

public class getUniCode_AtGivenIndex {

	public static void main(String[] args) {

		String str = "w3resource.com";
		int val1 = str.codePointAt(1);
		int val2 = str.codePointAt(9);

		System.out.println("Character(unicode point) of index 1 = " + val1);
		System.out.println("Character(unicode point) of index 9 = " + val2);

		System.out.println("**********************************");

//Write a Java program to count UnicCode code points in the specified text range of a string.
		System.out.println("Original String : " + str);
		// codePoint from index 1 to index 10
		int val3 = str.codePointCount(1, 10);
		// prints character from index 1 to index 10
		System.out.println("Codepoint count = " + val3);
	}

}
