package com.kn.encapsulation;

public class Employee{
    int id;
    String name;
  
  public Employee(int a, String b) {
	  id = a;
	  name = b;
  }
  
  //empty constructor
  public Employee() {
	  
  }
  
  //String parameterized constructor
  public Employee(String name) {
	  this.name = name;
  }
  
  public int getId() {
	  return id;
  }
  
  public String getName() {
	  return name;
  }


}

	