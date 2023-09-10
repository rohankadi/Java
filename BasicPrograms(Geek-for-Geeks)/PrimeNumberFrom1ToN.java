//Java program to find all the prime numbers from 1 to N
package com.kn.basicPrograms;

public class PrimeNumberFrom1ToN {
	// The Driver code
	public static void main(String[] args) {
		int N = 10;
		prime_N(N);
	}

	public static void prime_N(int N) {
		
		for(int i=1; i<=N; i++) {
		int flag = 0;
		if(i == 0 || i == 1) {
		   continue;
		}
		else {
		for(int j=2; j<i; j++)
		{
			if(i % j == 0) {
				flag = 1;
				break;
			}
		}
	 }
		if(flag == 0) {
			System.out.println(i);
		}
		}
	}

	// Function to print all the
	// prime numbers till N
	
}
