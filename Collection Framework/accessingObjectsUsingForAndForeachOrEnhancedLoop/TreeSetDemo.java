package com.rk.accessingObjectsUsingForAndForeachOrEnhancedLoop;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(175);
		ts.add(75);
		ts.add(125);
		
		System.out.println(ts);
		
		System.out.println("========================================");
		//accessing the object by using ==> enhanced for-loop / for-each loop 
		for(Integer x : ts) {
			System.out.print(x + " ");
		}
	}

}
