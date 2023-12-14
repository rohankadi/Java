package com.hib.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//POJO CLASS
@Entity
public class Student {

	// attributes
	@Id  //==> means id is primary key
	int id;
	String name;
	int age;

//	Empty Constructor
	public Student() {
	}

//parameterized constructor
	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

//Getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getage() {
		return age;
	}

	public void setage(int age) {
		this.age = age;
	}
}
