package com.kn.polymorphism;

public class PaymentApp1 {

	public static void main(String[] args) {
		Payment p = new Payment();
		p.bill();
		p.offer();
		p.pay();

		System.out.println("************************");
		p = new UPI();
		p.bill();
		p.offer();
		p.pay();

		System.out.println("************************");
		p = new Wallet();
		p.bill();
		p.offer();
		p.pay();

		System.out.println("************************");
		p = new Card();
		p.bill();
		p.offer();
		p.pay();
	}

}
