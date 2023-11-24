//Compare a given string to the specified string buffer
package com.kn.StringExercises;

public class CompareStringWithBuffer {

	public static void main(String[] args) {
		String str1 = "example.com", str2 = "Example.com";
		StringBuffer str = new StringBuffer(str1);
		
		System.out.println("Comparing "+ str1 +" and "+ str + ": " + str1.contains(str));
		System.out.println("Comparing "+ str2 +" and "+ str + ": " + str2.contains(str));
		
	}

}
