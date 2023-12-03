package com.kn.NeonNumber;

import java.util.Scanner;

public class Neon_NumberPrint {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);  
		System.out.print("Enter a number to check: ");  
		//reading a number from the user  
		int num = scan.nextInt();  //assume input taken as '9'
		int r, sum=0, square;
		
		//Square a given number ==> 9*9 = 81
		square = num * num;
		
		//for(int i=num; square > 0; i--) {
		while(square > 0) {         //81>0(true), 8>0(true), 0>0(false)
			 r = square % 10;       //81%10=8.1, r=1; 8%10=0.8, r=8;
			 sum = sum + r;      //sum = 0+1; sum = 1+8=9;
			 square = square / 10;       //8.1/10=8; 0.8/10=0
		}
	  System.out.println(sum);
		scan.close();

	}

}
