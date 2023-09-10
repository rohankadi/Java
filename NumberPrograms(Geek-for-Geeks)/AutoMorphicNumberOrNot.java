package com.kn.javaNumberPrograms;

import java.util.Scanner;

public class AutoMorphicNumberOrNot {

	// Driver code
		public static void main(String args[]) {
			// number to be check
			// calling the method and prints the result accordingly
			System.out.println(isAutomorphic(76) ? "Automorphic" : "Not Automorphic");
			System.out.println(isAutomorphic(23) ? "Automorphic" : "Not Automorphic");
		}
		
		
		//user-defined static method that checks whether the number is automorphic or not   
		static boolean isAutomorphic(int num) {
			// determines the square of the specified number
			int square = num * num;
			// comparing the digits until the number becomes 0
			while (num > 0) {
				// find the remainder (last digit) of the variable num and square and comparing
				// them
				if (num % 10 != square % 10) {
					// returns false if digits are not equal
					return false;
				}
				else 
				{
				// reduce num and square by dividing them by 10
				num = num / 10;
				square = square / 10;
				}
			}
			return true;
		}


}
