//Printing based on age
package com.rk.TreeSet;

public class Person implements Comparable<Person>{
	int age;
	float height;
	String gender;
	String name;

	public Person(int age, float height, String gender, String name) {
		super();
		this.age = age;
		this.height = height;
		this.gender = gender;
		this.name = name;
	}

	@Override
	public String toString() {
		return name + " " + age;
	}

	@Override
	public int compareTo(Person second) {
		if (this.age > second.age) 
		{
			return 1;
		} 
		else
		{
			return -1;
		}
	}
}
