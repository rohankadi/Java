package com.kn.string;

public class StringConcatination {
	public static void main(String[] args) {
		String s1 = "Ram";
		String s2 = "Sita";

		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);

		System.out.println("**********************");

		// Concatinantion using concat()
		//01
		String s3 = s1.concat(s2); // we need to strore it in s3 cz, Strings are immutable.

		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3);
		System.out.println("**********************");
		
		// 02
		s1 = s1.concat(s2); 

		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);

	}

}
