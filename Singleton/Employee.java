//counting TOTAL NO OF OBJECTS CREATED
package com.kn.Singleton;
public class Employee {
	String name;
	int id; 
	static int count = 0;
	
	public String getName() {
		return name;
	}
	
	public int getId() {
	 return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setID(int id) {
		this.id = id;
	}
	
	
	public Employee(){
		count++;
	}
}
