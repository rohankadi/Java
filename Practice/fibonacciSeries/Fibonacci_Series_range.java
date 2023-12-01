package com.kn.fibonacciSeries;

import java.util.Scanner;

public class Fibonacci_Series_range {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a range = ");
		int n = scan.nextInt();
		int firstnum = 0, secondnum = 1;
		
		//printing 0 and 1 
		System.out.print(firstnum + " " + secondnum);
		
	   //loop starts from 2 because 0 and 1 are already printed    
		for(int i = 2; i<=n; i++) 
		{
		int nextnum = firstnum + secondnum;
		System.out.print(" " + nextnum);
		firstnum = secondnum;
		secondnum = nextnum;
		}
		scan.close();
	}

}
