package com.kn.stringprograms;

public class SpaceReplaceWith99reverse {

	public static void main(String[] args) {
		String s1 = "My name is Rohan";

		char[] arr = s1.toCharArray();
		String reverse = "";

		for (int i = arr.length - 1; i >= 0; i--) {
			reverse = reverse + arr[i];
		}
	   //	System.out.println(reverse);
		
		// replace the space with 99
		System.out.println(reverse.replace(" ", "99"));
	}

}
