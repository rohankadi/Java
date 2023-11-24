//Write a Java program to check whether two String objects contain the same data.
package com.kn.StringExercises;

public class StringObjSameData {

	public static void main(String[] args) {
		String str1 = new String("Hello World!");
		String str2 = new String("Hello World!");
		String str3 = new String("Bye World!");

		//literals
		//str1 = "Hello World!";
		//str2 = "Hello World!";
		//str3 = "Bye World!";
		
		System.out.println(str1.equals(str2));
		System.out.println(str3.equals(str1));
	}
}
