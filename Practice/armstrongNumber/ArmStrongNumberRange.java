package com.kn.armstrongNumber;

public class ArmStrongNumberRange {

	public static void main(String[] args) {

		System.out.println("Armstrong numbers from 1 to 1000: ");

		for (int i = 1; i <= 1000; i++) {
			int num, r, sum = 0;
			num = i;
	
			while (num > 0) {
				r = num % 10;
				r = r * r * r;
				sum += r;
				num = num / 10;
			}
			//System.out.println(sum);

			if (sum == i) {
				System.out.print(i + " ");
			} 
			}
		}
	}
