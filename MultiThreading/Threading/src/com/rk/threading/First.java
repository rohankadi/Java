package com.rk.threading;

public class First {

	public static void main(String[] args) {
		
		Thread t = Thread.currentThread();
		System.out.println("This line is Excecuted by " + t );
	}
}
