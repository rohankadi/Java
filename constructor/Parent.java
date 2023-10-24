package com.kn.constructor;

public class Parent {
	String name = "motu";
	int age = 50;

	public Parent() {
		super(); // parent of Parent is OBJECT
		System.out.println("----> Parent class Constructer");
	}

	/*
	public Parent(String name, int age) {
		super(); // parent of Parent is OBJECT
		System.out.println("@@@@@@@>before");
		System.out.println("Name = " + this.name + ", Age = " + this.age);
		System.out.println("child 2-arg constructor");
		
		this.name = name;
		this.age = age;
		System.out.println("@@@@@@@@>after");
		System.out.println("Name = " + this.name + ", Age = " + this.age);
		System.out.println("child 2-arg constructor");
	}
	*/

}
