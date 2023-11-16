package com.rk.HandlingException1;

public class Bank {
	public void initiate() {
		try {
		System.out.println("Connection 2 Estsblished");
		
		ATM atm = new ATM();
		atm.withdraw();
		}
		
		catch(Exception e) {
			System.out.println("ISSUE REACHED BANK AND COUNT INCREMENTED");
		}
		System.out.println("Connection 2 Terminated");
	}
}
