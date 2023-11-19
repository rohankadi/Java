package com.rk.accessingObjectsUsingIterators;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(100);
		hs.add(50);
		hs.add(150);
		hs.add(25);
		hs.add(175);
		hs.add(75);
		hs.add(125);

		Iterator<Integer> itr = hs.iterator();
		// as long as true print next() element
		while (itr.hasNext() == true) {
			System.out.print(itr.next() + " ");
		}

		System.out.printf("\n=========================================\n");
		
		System.out.println(hs);

		System.out.println("========================================");
		// accessing the object by using ==> enhanced for-loop / for-each loop
		for (Integer x : hs) {
			System.out.print(x + " ");
		}
	}

}
