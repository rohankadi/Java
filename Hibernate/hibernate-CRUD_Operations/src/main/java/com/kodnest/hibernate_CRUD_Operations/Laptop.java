package com.kodnest.hibernate_CRUD_Operations;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Laptop {


	@Id
	int laptop_id;
	String laptop_name;
	int laptop_cost;
	
	//toString() method
	@Override
	public String toString() {
		return "Laptop [laptop_id=" + laptop_id + ", laptop_name=" + laptop_name + ", laptop_cost=" + laptop_cost + "]";
	}
	
	//zero parameterized constructor
	public Laptop() {
	}

	//parameterized constructor
	public Laptop(int laptop_id, String laptop_name, int laptop_cost) {
		this.laptop_id = laptop_id;
		this.laptop_name = laptop_name;
		this.laptop_cost = laptop_cost;
	}
	
	//getters and setters
	public int getLaptop_id() {
		return laptop_id;
	}

	public void setLaptop_id(int laptop_id) {
		this.laptop_id = laptop_id;
	}

	public String getLaptop_name() {
		return laptop_name;
	}

	public void setLaptop_name(String laptop_name) {
		this.laptop_name = laptop_name;
	}

	public int getLaptop_cost() {
		return laptop_cost;
	}

	public void setLaptop_cost(int laptop_cost) {
		this.laptop_cost = laptop_cost;
	}
}
