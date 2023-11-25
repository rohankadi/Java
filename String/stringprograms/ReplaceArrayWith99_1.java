package com.kn.stringprograms;

public class ReplaceArrayWith99_1 {

	public static void main(String[] args) {
		String str = "My name is Rohan";

		char[] arr = str.toCharArray();
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == ' ') {
				System.out.print(99);
			}
			else {
				System.out.print(arr[i]);
			}
		}
	}
}
