package com.kn.stringprograms;

public class ReverseALine1 {

	public static void main(String[] args) {
		String s1 = "I am Learning Strings in Java";
		String[] srr = s1.split(" ");
		
		for(int i=0; i<=srr.length-1; i++) {
			printCharacterInReverse(srr[i]);
		}

	}

	public static void printCharacterInReverse(String s1) {
		char crr[] = s1.toCharArray();
		for(int i=crr.length-1; i>=0; i--) {
			System.out.print(crr[i]);
		}
		System.out.print(" ");
	}

}
