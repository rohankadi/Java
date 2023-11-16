package com.rk.CustomizedException;

public class UnderAgeException extends Exception{

	@Override
	public String getMessage() {
		return "You are too young to get married...";
	}
	
}
