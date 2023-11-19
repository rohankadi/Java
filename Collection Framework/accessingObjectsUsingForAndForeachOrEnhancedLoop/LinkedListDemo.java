package com.rk.accessingObjectsUsingForAndForeachOrEnhancedLoop;

import java.util.*;

public class LinkedListDemo {
	public static void main(String[] args) {

		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(100);
		ll.add(50);
		ll.add(150);
		ll.add(25);
		ll.add(175);
		ll.add(75);
		ll.add(125);

		System.out.println(ll);

		System.out.println("=========================================");

		// accessing the object by using ==> for-loop (it is only supported for ForLoop only)
		for (int i = 0; i < ll.size(); i++) {
			System.out.print(ll.get(i) + " "); //get only supports list. not queue and set
		}

		System.out.printf("\n=========================================\n");

		// accessing the object by using ==> enhanced for-loop / for-each loop
		for (Integer x : ll) {
			System.out.print(x + " ");
		}

	}
}
