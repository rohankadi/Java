package com.rk.HandlingException;

public class Bank {

	public void initiate() {
		System.out.println("Connection 2 Estsblished");
		
		ATM atm = new ATM();
		atm.withdraw();
		
		System.out.println("Connection 2 Terminated");
	}
}
