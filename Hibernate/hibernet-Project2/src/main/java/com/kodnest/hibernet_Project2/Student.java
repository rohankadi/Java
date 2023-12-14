package com.kodnest.hibernet_Project2;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student {
	
	//Attributes
	@Id
	int rollno;
	String name;
	int age;
	
	@OneToOne
	Bike bike;
	
	//Zero parameterized constructor
	public Student() {
	}
	
	//Two parameterized constructor
	public Student(int rollno, String name, int age, Bike bike) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.bike = bike;
	}
	
	//Getters and setters
	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
