//CHECKING WHETHER NULL VALUE INSERTION POSSIBLE OR NOT
package com.rk.NullValueInsertionPossibleOrNot;

import java.util.*;

public class NullValueInsertionChecking {

	public static void main(String[] args) {

		ArrayList ar = new ArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(30);
		ar.add(null);
		System.out.println("Array List : " + ar);

		LinkedList ll = new LinkedList();
		ll.add(80);
		ll.add(20);
		ll.add(30);
		ll.add(30);
		ll.add(null);
		System.out.println("Linked List : " + ll);


		HashSet hs = new HashSet();
		hs.add(80);
		hs.add(10);
		hs.add(30);
		hs.add(30);
		hs.add(null);
		System.out.println("HashSet : " + hs);

		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(80);
		lhs.add(10);
		lhs.add(30);
		lhs.add(30);
		lhs.add(null);
		System.out.println("LinkedHashSet : " + lhs);
		
		/*
		ArrayDeque ad = new ArrayDeque();
		ad.add(80);
		ad.add(20);
		ad.add(30);
		ad.add(30);
		ll.add(null);
		System.out.println("Array Deque : " + ad);
		
		
		PriorityQueue pr = new PriorityQueue();
		pr.add(80);
		pr.add(10);
		pr.add(30);
		pr.add(30);
		pr.add(null);
		System.out.println("Priority Queue : " + pr);
		

		TreeSet ts = new TreeSet();
		ts.add(80);
		ts.add(10);
		ts.add(30);
		ts.add(30);
		ts.add(null);
		System.out.println("TreeSet : " + ts);
		 */

	}
}
