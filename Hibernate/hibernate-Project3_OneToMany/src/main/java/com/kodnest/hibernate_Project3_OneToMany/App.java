package com.kodnest.hibernate_Project3_OneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		// create product object
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		Product p4 = new Product();

		List<Product> list1 = new ArrayList<Product>();
		List<Product> list2 = new ArrayList<Product>();

		list1.add(p1);
		list1.add(p2);
		list2.add(p3);
		list2.add(p4);

		// create customer object
		Customer customer1 = new Customer(11, "Ankit", 23, list1);
		Customer customer2 = new Customer(12, "Anuj", 25, list2);
		
		p1.setProduct_id(1111);
		p1.setProduct_name("Watch");
		p1.setProduct_cost(4500);
		p1.setCust(customer1);
		
		p2.setProduct_id(2222);
		p2.setProduct_name("Mobile");
		p2.setProduct_cost(25000);
		p2.setCust(customer1);
		
		p3.setProduct_id(3333);
		p3.setProduct_name("Laptop");
		p3.setProduct_cost(85000);
		p3.setCust(customer2);
		
		p4.setProduct_id(4444);
		p4.setProduct_name("Bike");
		p4.setProduct_cost(170000);
		p4.setCust(customer2);
		
		
		Configuration cnfg = new Configuration();
		cnfg.configure();
		SessionFactory factory = cnfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		
		//save all
		session.save(customer1);
		session.save(customer2);
		session.save(p1);
		session.save(p2);
		session.save(p3);
		session.save(p4);
		
		//commit
		trans.commit();
		System.out.println("Saved Successfully!");
	}
}
