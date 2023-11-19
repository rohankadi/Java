package com.rk.accessingObjectsUsingForAndForeachOrEnhancedLoop;

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

		System.out.println(lhs);

		System.out.println("========================================");
	
		// accessing the object by using ==> enhanced for-loop / for-each loop
		for (Integer x : lhs) {
			System.out.print(x + " ");
		}
	}
}