//Java Program to Add Two Binary Strings.

package com.kn.addBinaryStrings;


public class ProgramToAddTwoBinaryStrings {
	 // Main driver method
	public static void main(String[] args) {

	    String x = "110";
	    String y = "011";
	    
	    //Method calling
        String res =  addBinary(x, y);
        System.out.println(res);

	}

	//Method declaration
	public static String addBinary(String x, String y) {
		int num1 = Integer.parseInt(x, 2);
        // converting binary string into integer(decimal
        // number)
 
        int num2 = Integer.parseInt(y, 2);
        // converting binary string into integer(decimal
        // number)
 
        int sum = num1 + num2;
        // Adding those two decimal numbers and storing in
        // sum
 
        String result = Integer.toBinaryString(sum);
        // Converting that resultant decimal into binary
        // string
        
		return result;
	}
}
