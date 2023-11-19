package com.rk.accessingObjectsUsingForAndForeachOrEnhancedLoop;

import java.util.HashSet;

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

		System.out.println(hs);

		System.out.println("========================================");
		// accessing the object by using ==> enhanced for-loop / for-each loop
		for (Integer x : hs) {
			System.out.print(x + " ");
		}
	}

}
