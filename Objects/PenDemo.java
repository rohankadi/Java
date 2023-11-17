package com.kn.objects;

public class PenDemo {

	public static void main(String[] args) {
		Pen pen1 = new Pen();
		pen1.color = "blue";
		pen1.type = "gel";
		
		Pen pen2 = new Pen();
		pen2.color = "black";
		pen2.type = "ballpoint";
		
//		System.out.println("color = "+ pen1.color + ", type = " + pen1.type);
//		System.out.println("color = "+ pen2.color + ", type = " + pen2.type);
		
		pen1.printColor();
		pen2.printColor();
		
		pen1.printType();
		pen2.printType();
		
		pen1.write();
		pen2.write();
	}

}
