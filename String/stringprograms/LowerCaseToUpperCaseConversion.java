package com.kn.stringprograms;

public class LowerCaseToUpperCaseConversion {

	public static void main(String[] args) {
		String s1 = "I Love Learning Strings in Java";

		char[] srr = s1.toCharArray();

		// Lower to Uppercase
		for (int i = 0; i <= srr.length - 1; i++) {
			if (srr[i] >= 97 && srr[i] <= 122) {
				// char l = (char)(srr[i] - 32);
				srr[i] = (char) (srr[i] - 32);
				System.out.print(srr[i]);
			} else {
				System.out.print(srr[i]);
			}
		}

		System.out.println();
		System.out.println("===============> 02nd program <===============");
		// 02
		// Uppercase to lowercase sentence
		String s2 = "I LOVE LEARNING Strings in JAVA";
		char[] arr = s2.toCharArray();

		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] >= 65 && arr[i] <= 90) {
				arr[i] = (char) (arr[i] + 32);
				System.out.print(arr[i]);
			} else {
				System.out.print(arr[i]);
			}
		}


		System.out.println("\n===============> 03rd program <===============");

		for (int i = 0; i < srr.length; i++) {
			if (srr[i] >= 97 && srr[i] <= 122) {
				int upper = srr[i] - 32;
				System.out.print((char) (upper));
			} else {
				System.out.print(srr[i]);
			}
		}

	
		System.out.println("\n===============> 04th program <===============");
		for (int i = 0; i < srr.length; i++) {
			if (srr[i] >= 65 && srr[i] <= 90) {
				int lower = srr[i] + 32;
				System.out.print((char) (lower));
			} else {
				System.out.print(srr[i]);
			}

		}
	}
}
