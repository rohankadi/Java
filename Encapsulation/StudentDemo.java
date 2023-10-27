package com.kn.encapsulation;

public class StudentDemo {
  public static void main(String[] args) {
	
	  Student s = new Student("Rohan", 3, 23);
	  
	  System.out.println(s.getId() + " " + s.getName() + " " + s.getAge());
 }
}
