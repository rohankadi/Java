package com.rk.TreeSet;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();

		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(75);
		ts.add(125);
		ts.add(175);

		System.out.println(ts);

		// Some methods
		System.out.println("==================================");
		System.out.println("ceiling = " + ts.ceiling(70));
		System.out.println("floor = " + ts.floor(70));
		System.out.println("==================================");

		// **********************************************

		System.out.println("Difference ==> ");
		System.out.println("ceiling = " + ts.ceiling(75));
		System.out.println("floor = " + ts.floor(75));

		System.out.println("higher = " + ts.higher(75));
		System.out.println("lower = " + ts.lower(75));
		System.out.println("==================================");

		// **********************************************
		// give elements present before 75
		System.out.println("headSet = " + ts.headSet(75));
		// give elements present after with including 75
		System.out.println("tailSet = " + ts.tailSet(75));
		System.out.println("==================================");
	}
}
