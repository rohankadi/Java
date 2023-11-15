package com.rk.DuckingException1;

public class UCUCU {
	
	//leaving without handling =>(throwing an exception to caller)
	public static void main(String[] args) {
		System.out.println("Main Connection Established");

		Bank bank = new Bank();
		bank.initiate();

		System.out.println("Main Connection Terminated");
	}
}

/* 
  The user(Bank) exception handler will handle the exception,
  but loss of resources occur 
  
  
Main Connection Established
Connection 2 Established
Connection 1 Established
Enter accno and pwd
20000
0
EXCEPTION HANDLED BY BANK
Connection 2 Terminated
Main Connection Terminated


==> Connection 1 is not get Terminated so, loss of resources
 */
