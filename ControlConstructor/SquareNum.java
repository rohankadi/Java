package ControlConstructor;

import java.util.Scanner;

public class SquareNum {
	 public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number = ");
		int num = scan.nextInt();
		
		double sqrt = squareNumber(num);
		System.out.println("The Square value for the "+ num + " is = "+ sqrt);
		
		scan.close();
	}
	 
	 static double squareNumber(int num) {
		double square = num*num;
		// double square = Math.pow(num , 2);
		 return square;
	 }
}
