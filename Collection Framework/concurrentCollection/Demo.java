package com.rk.concurrentCollection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Demo {

	/*
	 => If we want Right data is to be executed, even though concurrent
	    modification occur so we have make a use of classes present in 'concurrent
	    collections'.
	    (safely failure happens)
	 */

	public static void main(String[] args) {
		CopyOnWriteArrayList al = new CopyOnWriteArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);

		Iterator itr = al.iterator();
		while (itr.hasNext() == true) {
			System.out.print(itr.next() + " ");
			al.add(99);
		}
		
		System.out.printf("\n========================\n");
		
		System.out.println(al);

	}

}
