package com.kn.polymorphism;

public class PaymentApp {

	public static void main(String[] args) {
		Payment p = new Payment();
		p.bill();
		p.offer();
		p.pay();

		System.out.println("*************************");
		UPI u = new UPI();
		u.bill();
		u.offer();
		u.pay();
		
		System.out.println("*************************");
		Wallet w = new Wallet();
		w.bill();
		w.offer();
		w.pay();
		
		System.out.println("*************************");
		Card c = new Card();
		c.bill();
		c.offer();
		c.pay();
		
	}

}
