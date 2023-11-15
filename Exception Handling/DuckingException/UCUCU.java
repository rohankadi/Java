package com.rk.DuckingException;

public class UCUCU {
	
	//leaving without handling =>(throwing an exception to caller)
	public static void main(String[] args) throws Exception {
		System.out.println("Main Connection Established");

		Bank bank = new Bank();
		bank.initiate();

		System.out.println("Main Connection Terminated");
	}
}

/*
  All throws an exception without handling. 
  therefore the default exception  handler will handle the exception.
  there is a chances of losing resources
 */
