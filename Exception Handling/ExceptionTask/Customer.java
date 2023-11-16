package com.rk.exceptionTask;

import java.util.Scanner;

public class Customer {

	private int accountNumber = 1111;
	private int password = 2222;
	
	int userAccountNumber;
	int userPassword;
	
	void takeInput() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter User Account number = ");
		userAccountNumber = scan.nextInt();
		System.out.print("Enter User Password = ");
		userPassword = scan.nextInt();
	}

	void verify() throws InvalidException {
		if(accountNumber == userAccountNumber && password == userPassword) {
			System.out.println("Please, Collect your money");
		}else {
		    InvalidException ie = new InvalidException();
		    System.out.println(ie.getMessage());
		    throw ie;
		}
	}
}

