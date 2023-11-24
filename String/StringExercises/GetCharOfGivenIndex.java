//Write a Java program to get the character at the given index within the string
package com.kn.StringExercises;

public class GetCharOfGivenIndex {
	public static void main(String[] args) {
	 
		String str = "Java Exercises";
		
		int index1 = str.charAt(0);
		int index2 = str.charAt(10);
		
		System.out.println("The character at position 0 is : " + (char)index1);
		System.out.println("The character at position 10 is : " + (char)index2);
	}
}
