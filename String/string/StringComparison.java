package com.kn.string;

public class StringComparison {

	public static void main(String[] args) {
		String s1 = "Ram";
		String s2 = "Ram";
		//Reference Comparison
		if(s1 == s2) {
			System.out.println("References are Same");
		}
		else {
			System.out.println("References are Different");
		}
		
		//String Comparison
		if(s1.equals(s2)) {
			System.out.println("Strings are Equal");
		}
		else {
			System.out.println("Strings are Unequal");
		}

		//02
		String s3 = new String("Sita");
		String s4 = new String("Sita");
		//Reference Comparison
		if(s3 == s4) {
			System.out.println("References are Same");
		}
		else {
			System.out.println("References are Different");
		}

		//String Comparison
		if(s3.equals(s4)) {
			System.out.println("Strings are Equal");
		}
		else {
			System.out.println("Strings are Unequal");
		}

	}

}
