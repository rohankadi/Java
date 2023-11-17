package com.rk.threading;

public class Second {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("This line is Excecuted by " + t );
		
		//we can change name and priority of thread
		t.setName("Rohan");
		t.setPriority(3);
		
		System.out.println("This line is Excecuted by " + t );

	}

}
