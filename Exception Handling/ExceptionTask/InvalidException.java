package com.rk.exceptionTask;
//Customized Exception
public class InvalidException extends Exception{

	@Override
	public String getMessage() {
		return "Invalid Account Number Or Password please try again...";
	}
	
}
