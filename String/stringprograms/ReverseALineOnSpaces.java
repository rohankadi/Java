package com.kn.stringprograms;

public class ReverseALineOnSpaces {

	public static void main(String[] args) {
		// 01
		String s1 = ("I am Learning Strings in Java");
		String[] srr = s1.split(" ");

		for (int i = srr.length - 1; i >= 0; i--) {
			System.out.print(srr[i] + " ");
		}

		System.out.println();
		System.out.println("*************************************");
		
		// 02
		 String s2 = "I am learning strings in java";
		 String[] arr = s2.split(" ");
		 
		 String reverse = "";
		 
		 for(int i=arr.length-1; i>=0;i--) {
			 reverse = reverse + arr[i] + " ";
		 }

		 System.out.println(reverse);
	}
}
//Java in Strings Learning am I 


