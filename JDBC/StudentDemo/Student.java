package com.kn.JDBC.StudentDemo;

public class Student {


	int id;
	String name;
	int marks;
	
	public Student(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
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
	
	public int getmarks() {
		return marks;
	}
	
	public void setmarks(int marks) {
		this.marks = marks;
	}
}
