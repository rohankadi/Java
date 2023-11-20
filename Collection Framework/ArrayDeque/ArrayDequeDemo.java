package com.rk.ArrayDeque;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		
		ArrayDeque ad = new ArrayDeque();
		ad.add(100);
		ad.add(50);
		ad.add(150);
		ad.add(25);
		ad.add(75);
		ad.add(125);
		ad.add(175);
		
		System.out.println(ad);
		//precision for first insertion
		ad.addFirst(999);
		System.out.println(ad);
		
		ad.addLast(1000);
		System.out.println(ad);
		
		ad.add(200);
		System.out.println(ad);
		
		
		//We cannot add Array in between
	}

}
