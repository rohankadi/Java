package com.kn.statickeyword;

public class BusinessmanApp {
	public static void main(String[] args) {
		
		BusinessMan malya = new BusinessMan();
		BusinessMan modi = new BusinessMan();
		BusinessMan aani = new BusinessMan();
		
		malya.collectInputs();
		malya.simpleInterest();
		malya.displaySI();
		
		System.out.println("=====================================");
		
		modi.collectInputs();
		modi.simpleInterest();
		modi.displaySI();
		
		System.out.println("=====================================");
		
		aani.collectInputs();
		aani.simpleInterest();
		aani.displaySI();
	}
}
