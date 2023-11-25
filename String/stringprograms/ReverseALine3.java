package com.kn.stringprograms;

public class ReverseALine3 {

	public static void main(String[] args) {
		String s1 = "I am Learning Strings in Java";
		char[] arr = s1.toCharArray();
		
		String reverse = " ";
		
		for(int i=arr.length-1; i>=0; i--) {
			reverse = reverse + arr[i];
		}
		System.out.print(reverse);

	}

}
