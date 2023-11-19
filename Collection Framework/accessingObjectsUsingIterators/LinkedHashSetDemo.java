package com.rk.accessingObjectsUsingIterators;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(100);
		lhs.add(50);
		lhs.add(150);
		lhs.add(25);
		lhs.add(175);
		lhs.add(75);
		lhs.add(125);

		Iterator<Integer> itr = lhs.iterator();
		// as long as true print next() element
		while (itr.hasNext() == true) {
			System.out.print(itr.next() + " ");
		}

		System.out.printf("\n=========================================\n");
		
		System.out.println(lhs);

		System.out.println("========================================");
	
		// accessing the object by using ==> enhanced for-loop / for-each loop
		for (Integer x : lhs) {
			System.out.print(x + " ");
		}
	}
}