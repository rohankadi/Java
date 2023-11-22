package com.rk.mapViews;

import java.util.*;

public class Demo {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(86, "Rohan");
		hm.put(42, "Kiran");
		hm.put(23, "Rajas");
		hm.put(12, "Aaraghya");
		hm.put(98, "Keerthi");

		System.out.println(hm);

		System.out.println("+++++++++++++++++++++++++++++++");
		// Accessing keys only

		System.out.println("Keys only printing : ");
		// System.out.println(hm.keySet());
		// or
		Set s = hm.keySet();
		// Printing the key using Iterator
		Iterator itr = s.iterator();
		while (itr.hasNext() == true) {
			System.out.print(itr.next() + " ");
		}

		System.out.println("\n+++++++++++++++++++++++++++++++\n");
		// Accessing values only

		System.out.println("Values only printing : ");
		// System.out.println(hm.values());

		Collection c = hm.values();
		Iterator itr1 = c.iterator();
		while (itr1.hasNext() == true) {
			System.out.print(itr1.next() + ", ");
		}

		System.out.println("\n+++++++++++++++++++++++++++++++\n");
		// Both key : value pair printing
		System.out.println("Both key : value pair printing : ");
        //System.out.println(hm.entrySet());

		Set s1 = hm.entrySet();
		Iterator itr2 = s1.iterator();
		while (itr2.hasNext() == true) {
			System.out.print(itr2.next() + ", ");
		}

		System.out.println("\n+++++++++++++++++++++++++++++++\n");
	}
}
