package com.rk.CustomizedException;

import java.util.Scanner;

public class Applicant {
	
	int age;
	
	 void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age : ");
		age = scan.nextInt();
		scan.close();
	}
	
	void verify() throws UnderAgeException, OverAgeException {
		if(age < 21) {
		//Exception occurs
		UnderAgeException uae = new UnderAgeException();
		System.out.println(uae.getMessage());
		throw uae;
		}
		
		else if(age > 45) {
			//Exception occurs
			OverAgeException oae = new OverAgeException();
			System.out.println(oae.getMessage());
			throw oae;
		}
		
		else {
			System.out.println("Congratulations.... Your application is accepted");
		}
		
	}
}
