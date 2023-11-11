package com.rk.OneResourceMultipleThreads;

public class BathroomApp1 {
	/*
	 * One resource is used at a time by all 03-threads, so it affect the
	 * performance of an application. => in order to solve this we have 02
	 * approaches 1. using join() => cheating thread scheduler 2. using synchronized
	 * keyword
	 */
	// 01st approach => join() method
	public static void main(String[] args) {
		try {
			Bathroom bathroom = new Bathroom();

			Thread t1 = new Thread(bathroom);
			Thread t2 = new Thread(bathroom);
			Thread t3 = new Thread(bathroom);

			t1.setName("BOY");
			t2.setName("GIRL");
			t3.setName("OTHER");

			t1.start();
			t1.join();
			t2.start();
			t2.join();
			t3.start();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
         /*
         BOY IS ENTERED BATHROOM
         BOY IS USING BATHROOM
         BOY IS LEAVING BATHROOM
         GIRL IS ENTERED BATHROOM
         GIRL IS USING BATHROOM
         GIRL IS LEAVING BATHROOM
         OTHER IS ENTERED BATHROOM
         OTHER IS USING BATHROOM
         OTHER IS LEAVING BATHROOM
          */
