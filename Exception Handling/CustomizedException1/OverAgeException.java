package com.rk.CustomizedException1;

public class OverAgeException extends Exception {

	@Override
	public String getMessage() {
		return "You are too old to get married...dont take risk at this age";
	}
}
