package com.rk.DuckingException1;

public class Bank {
	
	//leaving without handling =>(throwing an exception to caller)
	public void initiate(){
		System.out.println("Connection 2 Established");

		ATM atm = new ATM();
		
		try {
			atm.withdraw();
		} 
		catch (Exception e) {
			System.out.println("EXCEPTION HANDLED BY BANK");
			//e.printStackTrace();
		}

		System.out.println("Connection 2 Terminated");
	}
}
