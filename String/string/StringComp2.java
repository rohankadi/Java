package com.kn.string;

public class StringComp2 {

	public static void main(String[] args) {
		String s1 = "Ram";
		String s2 = "Sita";
		String s3 = s1 + s2;
		String s4 = s1 + s2;

		// 01
		System.out.println("Output for " + s1 + " and  " + s2 + ":");
		// Reference Comparison
		if (s1 == s2) {
			System.out.println("Same reference");
		} else {
			System.out.println("Different reference");
		}

		// String Comparison

		if (s1.equals(s2)) {
			System.out.println("Same String");
		} else {
			System.out.println("Different String");
		}

		// 02
		System.out.println("******************************");
		System.out.println("Output for " + s3 + " and  " + s4 + ":");

		// Reference Comparison
		if (s3 == s4) {
			System.out.println("Same reference");
		} else {
			System.out.println("Different reference");
		}

		// String Comparison
		if (s3.equals(s4)) {
			System.out.println("Same String");
		} else {
			System.out.println("Different String");
		}

	}

}
