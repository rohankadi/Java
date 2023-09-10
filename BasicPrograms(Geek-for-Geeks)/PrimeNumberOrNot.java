package com.kn.basicPrograms;

import java.util.Scanner;

public class PrimeNumberOrNot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number is to be checked = ");
		int n = scan.nextInt();
		
		//method calling
		if(isPrime(n)) {
			System.out.println(n + " is prime number");
		}
		else {
			System.out.println(n + " is not prime number");
		}
		scan.close();
	}

	//method
	public static boolean isPrime(int n) 
	{
		if(n <= 1) 
		{
			return false;
		}
		else {
		//for(int i=2; i<=n/2; i++) {
		for(int i=2; i<=Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		}
	 }
		return true;
	}

}
