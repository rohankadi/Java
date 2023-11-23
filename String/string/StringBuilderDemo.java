package com.kn.string;

public class StringBuilderDemo {

	public static void main(String[] args) {
	   
		StringBuilder stringbuilder1 = new StringBuilder("Ram");
		
		System.out.println("Data = " + stringbuilder1);
		System.out.println("Length = " + stringbuilder1.length());
		System.out.println("Capacity = " + stringbuilder1.capacity());
		
		System.out.println("******************************");
		
		System.out.println("******************************");
		
		stringbuilder1.append(" Sita");
		
		System.out.println("Data = " + stringbuilder1);
		System.out.println("Length = " + stringbuilder1.length());
		System.out.println("Capacity = " + stringbuilder1.capacity());

	}

}
