//If Wrong I/P  is given by the User
//Give 03 Chances to an User
package com.rk.CustomizedException1;

public class Matrimoney {

	public void acceptApplication() {
		Applicant applicant = new Applicant();
		//if 1st I/P is wrong
		try {
			applicant.acceptInput();
			applicant.verify();
		}
		catch (Exception e1)
		{
			//02nd chance to enter valid I/P
			try {
				applicant.acceptInput();
				applicant.verify();
			}
			catch(Exception e2) {
				//03rd chance to enter valid I/P
				try {
					applicant.acceptInput();
					applicant.verify();
				}
				catch(Exception e) {
					System.out.println("Exception got by Matrimoney, and You have exceed daily limit");
				}
			}
		}
	}
}
