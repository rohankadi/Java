package com.kn.accessModifiers_pack1;

public class Demo1 {

	public int a = 10;
	protected int b = 20;
			int c = 30; //default 
	private int d = 40;
	
	//method
	public void disp1() {
		System.out.println("a = " + a);
		System.out.println("b = " +b);
		System.out.println("c = " +c);
		System.out.println("d = " +d);
	}
}
