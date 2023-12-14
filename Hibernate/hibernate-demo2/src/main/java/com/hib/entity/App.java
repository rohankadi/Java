package com.hib.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();

   //Use the mappings and properties specified in an application resource named hibernate.cfg.xml.
		cfg.configure();
   //Create a SessionFactory using the properties and mappings in this configuration. 
		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();

		Transaction trans = session.beginTransaction();

      //Creating Student object
		Student st = new Student(2, "Dan", 22);

       //save
		session.save(st);

		// commit
		trans.commit();

		System.out.println("Student object is saved");
	}
}
