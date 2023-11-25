package com.kn.stringprograms;

public class LongestWordInString {

	public static void main(String[] args) {
		String s1 = "I am Learning Java";
		String[] arr = s1.split(" ");
		String longest = " ";
		
		for(int i=0; i<=arr.length-1; i++) {
			if(arr[i].length() > longest.length()) {
				longest = arr[i];
			}
		
		}
			System.out.println("The longest word in String is = '" + longest + "'");

	}
}
