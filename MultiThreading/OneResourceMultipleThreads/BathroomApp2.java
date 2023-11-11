package com.rk.OneResourceMultipleThreads;

public class BathroomApp2 {
	public static void main(String[] args) {

		Bathroom2 bathroom2 = new Bathroom2();

		Thread t1 = new Thread(bathroom2);
		Thread t2 = new Thread(bathroom2);
		Thread t3 = new Thread(bathroom2);

		t1.setName("BOY");
		t2.setName("GIRL");
		t3.setName("OTHER");

		t1.start();
		t2.start();
		t3.start();
	}
}

       /*
       BOY IS ENTERED BATHROOM
       BOY IS USING BATHROOM
       BOY IS LEAVING BATHROOM
       OTHER IS ENTERED BATHROOM
       OTHER IS USING BATHROOM
       OTHER IS LEAVING BATHROOM
       GIRL IS ENTERED BATHROOM
       GIRL IS USING BATHROOM
       GIRL IS LEAVING BATHROOM
        */
