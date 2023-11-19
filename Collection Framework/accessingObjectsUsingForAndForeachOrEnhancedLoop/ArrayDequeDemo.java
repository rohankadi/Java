package com.rk.accessingObjectsUsingForAndForeachOrEnhancedLoop;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
		ad.add(100);
		ad.add(50);
		ad.add(150);
		ad.add(25);
		ad.add(175);
		ad.add(75);
		ad.add(125);
		
		System.out.println(ad);
		
		System.out.println("=========================================");
		
		//accessing the object by using ==> enhanced for-loop / for-each loop 
		for(Integer x : ad) {
			System.out.print(x + " ");
		}
		

	}

}
