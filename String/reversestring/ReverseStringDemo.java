package com.kn.reversestring;

public class ReverseStringDemo {

	public String reverseString(String inputString) {
		char[] crr = inputString.toCharArray();
		StringBuffer reverseString = new StringBuffer();
		
		for(int i=crr.length-1; i>=0; i--) {
			reverseString = reverseString.append(crr[i]);
		}
		String reverseString2 = reverseString.toString();
		return reverseString2;
	}
}
