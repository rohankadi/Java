package com.rk.LinkedListMethods;

import java.util.LinkedList;

public class LinkedListMethods {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		ll.add(2, 999);
		ll.addFirst(1000);
		ll.addLast(10000);
		System.out.println("ll ==> " + ll);
		System.out.println("===========================");

		LinkedList ll2 = new LinkedList();
		ll2.add(10); //ll.add(new Integer(10));
		ll2.add(20);
		ll2.add(30);
		ll2.add(40);
		ll2.add(50);
		System.out.println("ll2 ==>" + ll2);
		System.out.println("===========================");
		
		System.out.println(ll.containsAll(ll2));
		System.out.println("===========================");

		System.out.println(ll.peek());
		System.out.println(ll);
		System.out.println("===========================");

		System.out.println(ll.poll());
		System.out.println(ll);
		System.out.println("===========================");
		
		ll.retainAll(ll2);
		System.out.println("ll ==>" + ll);
		System.out.println("ll2 ==>" + ll2);
	
       /*
        BOXING ==> Converting Primitive DataType to Objects 
        */
		
	}
}
