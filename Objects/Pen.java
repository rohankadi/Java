package com.kn.objects;

  class Pen {
	String color;
	String type;

	public void write() {
		System.out.println("Wrote something");
	}
	
	//another method to print the attributes
	public void printColor() {
		System.out.println(this.color);
	}
	
	public void printType() {
		System.out.println(this.type);
	}
}


