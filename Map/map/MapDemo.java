package com.rk.map;

import java.util.*;

public class MapDemo {

	public static void main(String[] args) {
		System.out.println("==============================================================================================");
		//01. HashMap
		HashMap hm = new HashMap();
		hm.put(100, new Student("Rohan", 22, "male", 98, 987654321, "rohan@google.com", "Bagalkot"));
		hm.put(50, new Student("Mohan", 20, "male", 89, 987654321, "mohan@google.com", "Mysore"));
		hm.put(150, new Student("Sohan", 26, "male", 78, 987654321, "sohan@google.com", "Aagra"));
		hm.put(27, new Student("Raam", 23, "male", 68, 987654321, "raam@google.com", "Mumbai"));
		hm.put(33, new Student("Kiran", 24, "male", 58, 987654321, "kiran@google.com", "Bengalore"));
		
		System.out.println(hm);

		System.out.println("==============================================================================================");
		//02. LinkedHashMap
		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put(100, new Student("Rohan", 22, "male", 98, 987654321, "rohan@google.com", "Bagalkot"));
		lhm.put(50, new Student("Mohan", 20, "male", 89, 987654321, "mohan@google.com", "Mysore"));
		lhm.put(150, new Student("Sohan", 26, "male", 78, 987654321, "sohan@google.com", "Aagra"));
		lhm.put(27, new Student("Raam", 23, "male", 68, 987654321, "raam@google.com", "Mumbai"));
		lhm.put(33, new Student("Kiran", 24, "male", 58, 987654321, "kiran@google.com", "Bengalore"));
		
		System.out.println(lhm);

		System.out.println("==============================================================================================");
	
		//TreeMap
		TreeMap tm = new TreeMap();
		tm.put(100, new Student("Rohan", 22, "male", 98, 987654321, "rohan@google.com", "Bagalkot"));
		tm.put(50, new Student("Mohan", 20, "male", 89, 987654321, "mohan@google.com", "Mysore"));
		tm.put(150, new Student("Sohan", 26, "male", 78, 987654321, "sohan@google.com", "Aagra"));
		tm.put(27, new Student("Raam", 23, "male", 68, 987654321, "raam@google.com", "Mumbai"));
		tm.put(33, new Student("Kiran", 24, "male", 58, 987654321, "kiran@google.com", "Bengalore"));
		
		System.out.println(tm);
		
		System.out.println("==============================================================================================");
		
	}
}
