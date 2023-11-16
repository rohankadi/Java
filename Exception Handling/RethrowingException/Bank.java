package com.rk.RethrowingException;

public class Bank {
	public void initiate() {
		try {
		System.out.println("Connection 2 Established");
		
		ATM atm = new ATM();
		atm.withdraw();
		
		}
		
		catch(Exception e) {
			System.out.println("ISSUE REACHED BANK AND COUNT INCREMENTED");
		}
		
		System.out.println("Connection 2 Terminated");
	}
}
