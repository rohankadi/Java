package com.kn.armstrongNumber;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number is to be checked = ");
		int n = scan.nextInt();
		
		double r;
		double sum = 0;
		int temp = n;
		for(int i = n; n > 0; i--) {
			r = n % 10;
			//r = r * r * r;
			r = Math.pow(r, 3);
			sum = sum + r;
			n = n / 10;
		}
		if(sum == temp) {
			System.out.println(temp + " is Armstrong Number");
		}
		else {
			System.out.println(temp + " is Not an Armstrong Number");
		}
		
		scan.close();

	}

}
