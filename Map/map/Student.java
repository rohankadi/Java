package com.rk.map;

public class Student {

	String name;
	int age;
	String gender;
	int marks;
	int phonenum;
	String email;
	String address;

	// Constructor creation
	public Student(String name, int age, String gender, int marks, int phonenum, String email, String address) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.marks = marks;
		this.phonenum = phonenum;
		this.email = email;
		this.address = address;
	}


	//to overcome from printing of reference variable address, we execute toString() method
	@Override
	public String toString() {
		return name + " " + age + " "+ gender + " " + marks + " "
		+ phonenum + " " + email + " " + address;
		
//		return "Student [name=" + name + ", age=" + age + ", gender=" + gender + ", marks=" + marks + ", phonenum="
//				+ phonenum + ", email=" + email + ", address=" + address + "]";
	}
	
	
}
