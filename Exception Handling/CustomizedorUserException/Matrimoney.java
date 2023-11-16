package com.rk.CustomizedException;

public class Matrimoney {

	public void acceptApplication() {
		try {
			Applicant applicant = new Applicant();

			applicant.acceptInput();
			applicant.verify();
		}
		catch (Exception e)
		{
			System.out.println("Exception Reached Matrimoney");
		}
	}
}
