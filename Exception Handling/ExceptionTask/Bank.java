package com.rk.exceptionTask;

public class Bank {

	public void acceptCustomer() {

		Customer customer = new Customer();
		try {
			customer.takeInput();
			customer.verify();
		}

		catch (Exception e) {
			try {
				customer.takeInput();
				customer.verify();
			} 
			catch (Exception e1) 
			{
				try {
					customer.takeInput();
					customer.verify();
				} 
				catch (Exception e2) 
				{
					System.out.println("Account Blocked please Visit our nearest branch");
				}
			}

		}
	}
}
