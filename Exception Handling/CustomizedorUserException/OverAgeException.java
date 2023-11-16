package com.rk.CustomizedException;

public class OverAgeException extends Exception {

	@Override
	public String getMessage() {
		return "You are too old to get married...dont take risk at this age";
	}
}
