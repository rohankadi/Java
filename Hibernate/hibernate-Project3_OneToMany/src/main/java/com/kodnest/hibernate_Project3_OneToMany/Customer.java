package com.kodnest.hibernate_Project3_OneToMany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Customer {

	@Id
	int customer_id;
	String customer_name;
	int customer_age;

	@OneToMany
	List<Product> product;

	// zero constructor
	public Customer() {
	}

	// parameterized constructor
	public Customer(int customer_id, String customer_name, int customer_age, List<Product> product) {
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.customer_age = customer_age;
		this.product = product;
	}

	// getters and setters
	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public int getCustomer_age() {
		return customer_age;
	}

	public void setCustomer_age(int customer_age) {
		this.customer_age = customer_age;
	}

	public List<Product> getproduct() {
		return product;
	}

	public void setproduct(List<Product> product) {
		this.product = product;
	}

}
