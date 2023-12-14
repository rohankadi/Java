package com.kodnest.hibernet_Project2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration cnfg = new Configuration();
        cnfg.configure();
        
        SessionFactory factory = cnfg.buildSessionFactory();
        
        Session session = factory.openSession();
        
        Transaction trans = session.beginTransaction();
        
        //Object of Bike
        Bike bike1 = new Bike(01, "Hero", "Black");
        Bike bike2 = new Bike(02, "KTM", "Red");
        Bike bike3 = new Bike(03, "Honda", "Blue");
        
        //1. UNI-DIRECTIONAL ONE TO ONE
        //Object of student
        Student st1 = new Student(11, "Ajay", 24, bike1);
        Student st2 = new Student(12, "Arun", 25, bike2);
        Student st3 = new Student(13, "Anuj", 26, bike3);
    	
        //Save
        session.save(st1);
        session.save(st2);
        session.save(st3);
        
        session.save(bike1);
        session.save(bike2);
        session.save(bike3);
    	
        //commit
        trans.commit();
        System.out.println("Succesfully added all the data to table");
    }
}
