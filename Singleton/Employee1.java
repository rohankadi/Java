package com.kn.Singleton;

public class Employee1 {

	String name;
	int id;
	static int count = 0;
	
	static Employee1 ref = null;

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String setName(String name) {
		return this.name = name;
	}

	public int setId(int id) {
		return this.id = id;
	}

	// restricting number of objects created by making constructor as private
	private Employee1() {
		count++;
	}

	//restricting user to create more than 1 object
	 static public Employee1 getObject() {
		 //if object is not present, then create one object
		if (ref == null) {
			ref = new Employee1();
			return ref;
		}
		//if obj is present return it
		return ref;
	}
}
