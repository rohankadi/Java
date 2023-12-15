package com.kodnest.hibernate_Project3_OneToMany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Product {

	@Id
	int product_id;
	String product_name;
	int product_cost;

	@ManyToOne
	Customer cust;

	public Product() {
	}

	public Product(int product_id, String product_name, int product_cost, Customer cust) {
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_cost = product_cost;
		this.cust = cust;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public int getProduct_cost() {
		return product_cost;
	}

	public void setProduct_cost(int product_cost) {
		this.product_cost = product_cost;
	}

	public Customer getCust() {
		return cust;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}
}
