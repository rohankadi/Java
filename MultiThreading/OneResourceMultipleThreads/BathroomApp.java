package com.rk.OneResourceMultipleThreads;

public class BathroomApp {

	public static void main(String[] args) {
		Bathroom bathroom = new Bathroom();
		
		Thread t1 = new Thread(bathroom);
		Thread t2 = new Thread(bathroom);
		Thread t3 = new Thread(bathroom);
		
		t1.setName("BOY");
		t2.setName("GIRL");
		t3.setName("OTHER");

		t1.start();
		t2.start();
		t3.start();
	
       /*
        * One resource is used at a time by all 03-threads, so it affect the performance 
          of an application.
          => in order to solve this we have 02 approaches
          1. using join() => cheating thread scheduler 
          2. using synchronized keyword
        * 
       BOY IS ENTERED BATHROOM
       OTHER IS ENTERED BATHROOM
       GIRL IS ENTERED BATHROOM
       OTHER IS USING BATHROOM
       BOY IS USING BATHROOM
       GIRL IS USING BATHROOM
       OTHER IS LEAVING BATHROOM
       BOY IS LEAVING BATHROOM
       GIRL IS LEAVING BATHROOM
       */
		
	}
}
