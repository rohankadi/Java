package com.kodnest.hibernate_CRUD_Operations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
//      create();
//      read();
//      update();
      delete();
      
    }

    //method to create a data
	public static void create() {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		
		//Creating a Laptop Object
		Laptop lap = new Laptop(11, "Dell", 85000);
		
		//save
		session.save(lap);
		//commit
		trans.commit();
		System.out.println("Created Successfully!");
	}	
	
	//method to retrieve a data
	public static void read() {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		
		//get() the data
		Laptop lap = session.get(Laptop.class, 11);
		//commit()
		trans.commit();
		//print
		System.out.println(lap);
	}
	
	//method to update the data
	public static void update() {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		
		//get() the data
		Laptop lap = session.get(Laptop.class, 11);
		//set() the data
		lap.setLaptop_name("Apple");
		lap.setLaptop_cost(125000);
		//save()
		session.save(lap);
		//commit()
		trans.commit();
		System.out.println("Data Updated Successfully!");
		
	}
	
	//method to delete a data
	public static void delete() {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		
		//get() the data
		Laptop lap = session.get(Laptop.class, 11);
		System.out.println("Read === > " + lap);
		session.delete(lap);
		trans.commit();
		System.out.println("Data Deleted Successfully!");
		
	}

}
