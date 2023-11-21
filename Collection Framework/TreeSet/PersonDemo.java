package com.rk.TreeSet;

import java.util.*;

public class PersonDemo {

	public static void main(String[] args) {
		Person p1 = new Person(22, 173, "male", "Ram");
		Person p2 = new Person(24, 176, "male", "kruthi");
		Person p3 = new Person(25, 163, "male", "keshav");
		Person p4 = new Person(20, 168, "female", "Roja");
		Person p5 = new Person(21, 156, "male", "Raj");

		TreeSet<Person> ts = new TreeSet<Person>();
		ts.add(p1);
		ts.add(p2);
		ts.add(p3);
		ts.add(p4);
		ts.add(p5);

		System.out.println(ts);
		
	}
}
