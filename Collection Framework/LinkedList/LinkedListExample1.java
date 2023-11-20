package com.rk.LinkedList;
import java.util.*;

public class LinkedListExample1 {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add("Raju");
		ll.add(3.147);
		ll.addFirst(9999);
		ll.addLast(true);
		System.out.println(ll);
		
		System.out.println("==========================");
		
		ll.add(2, 1000);
		System.out.println(ll);

	}

}
