package com.rk.DuckingException;

public class Bank {
	
	//leaving without handling =>(throwing an exception to caller)
	public void initiate() throws Exception {
		System.out.println("Connection 2 Established");

		ATM atm = new ATM();
		atm.withdraw();

		System.out.println("Connection 2 Terminated");
	}
}
