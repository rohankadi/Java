package com.kn.string;

public class StringComp4 {
	public static void main(String[] args) {
		String s1 = "Ram";
		String s2 = s1;

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

	}

}
