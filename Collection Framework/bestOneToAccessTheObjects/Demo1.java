package com.rk.bestOneToAccessTheObjects;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo1 {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);

		// Checking using Iterators
		Iterator itr = al.iterator();

		while (itr.hasNext() == true) {

			// printing size
			System.out.println("Size : " + al.size());
			// Reading the elements
			System.out.println(itr.next());
			// writing the elements at the same time
			al.add(99);
		}
	}
}

      /*
        Iterators are designed to DETECT CONCURRENT modification
        and stop reading by generating the concurrent exception
       */

      //OUTPUT
        /*
        Size : 5
        10
        Size : 6
        Exception in thread "main" java.util.ConcurrentModificationException
        	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
        	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
        	at com.rk.bestOneToAccessTheObjects.Demo1.main(Demo1.java:24)
        */
