package com.kn.basicPrograms;

import java.util.Scanner;

public class PrimeNumberOrNot1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number is to be checked = ");
		int n = scan.nextInt();
		
		int m = 0, flag = 0;
		m = n/2;
		scan.close();
		
		//check condition for 0 & 1
		if(n == 0 || n == 1) 
		{
			System.out.println(n + " is not a Prime Number");
		}
		else 
		{
			for(int i = 2; i <= m; i++) {
				if(n % i == 0) {
					System.out.println(n + " is not Prime Number");
					flag = 1;
					break;
				}
			}
		}
		
		if(flag == 0) 
		{
			System.out.println(n + " is Prime Number");
		}		
	}

}
