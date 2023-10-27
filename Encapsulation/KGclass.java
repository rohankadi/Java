package com.kn.encapsulation;

public class KGclass {
	private double a;

	public double getA() {
		return a;
	}

	public void setA(double a) {
		if (a <= 50) {
			this.a = a;
			System.out.println(a / 2);
		} else {
			System.out.println("Invalid value (the value is between 1-50)");
		}
	}
}
