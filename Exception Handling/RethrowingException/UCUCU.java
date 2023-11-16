package com.rk.RethrowingException;

public class UCUCU {
	public static void main(String[] args) {
		System.out.println("Main Connection Established");
		
		Bank bank = new Bank();
		bank.initiate();
		
		System.out.println("Main Connection Terminated");
	}
}


/*
Connection 3 Established
Connection 2 Established
Connection 1 Established
Enter accno and pwd
20000
00
EXCEPTION IN ATM...ISSUE SHOWN AND RESOLVED IN ATM
Connection 1 Terminated
ISSUE REACHED BANK AND COUNT INCREMENTED
Connection 2 Terminated
Connection 3 Terminated
 */
