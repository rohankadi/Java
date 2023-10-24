package com.kn.constructor;

public class Child extends Parent{
	String name = "Ron";
	int age = 16;
	
	//01 super()
	
	//String name;
	//int age;

	public Child() {
		super();
		System.out.println("child no-arg constructor");
	}
	
//	public Child(String name, int age) {
//		super();
//		System.out.println("child 2-arg constructor");
//		this.name = name;
//		this.age = age;
//	}
	
	public Child(String name, int age) {
		//this();  //call no arg class constructor
		this(age); //call age arg constructor
		System.out.println("child 2-arg constructor");
		this.name = name;
		this.age = age;
	}
	
	
	 /*
	public Child(String name, int age) {
		super(name, age);
		System.out.println("======>before");
		System.out.println("Name = " + this.name + ", Age = " + this.age);
		System.out.println("child 2-arg constructor");
		
		this.name = name;
		this.age = age;
		System.out.println("======>after");
		System.out.println("Name = " + this.name + ", Age = " + this.age);
		System.out.println("child 2-arg constructor");
		}
		*/

	
	public Child(String name) {
		super();
		System.out.println("-->child String arg Constructer");
		this.name = name;
	}
	
	public Child(int age) {
		super(); //call parent constructor
		System.out.println("-->child int arg Constructer");
		this.age = age;
	}
	

	
}