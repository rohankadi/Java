//import required classes and packages 
package com.kn.ATM;

import java.util.Scanner;

public class AutomatedTellerMachine {
	// main method starts
	public static void main(String[] args) {
		// create scanner class object to get choice of user
		Scanner scan = new Scanner(System.in);


//		while (true) {
			System.out.println("Automated Teller Machine");
			System.out.println("Choose 1 for Withdraw");
			System.out.println("Choose 2 for Deposit");
			System.out.println("Choose 3 for Check Balance");
			System.out.println("Choose 4 for Exit");

			System.out.print("Choose the operation you want to Perform : ");
			int operation = scan.nextInt();

			// declare and initialize balance, withdraw, and deposit
			int balance = 100000, withdraw, deposit;
			
			// get choice from user
			switch (operation) {
			case 1:
				System.out.print("Enter money to be withdrawn : ");
				// get the withdrawl money from user
				withdraw = scan.nextInt();
				// check whether the balance is greater than or equal to the withdrawal amount
				if (balance >= withdraw) {
					// remove the withdrawal amount from the total balance
					balance = balance - withdraw;
					System.out.println("Please collect your money");
				}
				// show custom error message
				else {
					System.out.println("Insufficient Balance");
				}
				System.out.println("");
				break;

			case 2:
				System.out.print("Enter money to be deposited : ");
				// get deposit amount from the user
				deposit = scan.nextInt();
				// add the deposit amount to the total balance
				balance = balance + deposit;
				System.out.println("Your money " + deposit + " has been successfully deposited in your account.");
				System.out.println("");
				break;

			case 3:
				// displaying the total balance of the user
				System.out.println("Balance : " + balance);
				System.out.println("");
				break;

			case 4:
				// exit from the menu
				System.exit(0);
				System.out.println("");
				break;
			}
//		}
		scan.close();
	}
}