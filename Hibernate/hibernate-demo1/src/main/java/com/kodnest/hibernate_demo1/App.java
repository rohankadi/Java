package com.kodnest.hibernate_demo1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	//object creation
    	Configuration conf = new Configuration();
    	conf.configure(); //only works ==> conf.configure("hibernate.cfg.xml");

    	SessionFactory factory = conf.buildSessionFactory();
    	
        Session session = factory.openSession();
    	 	
        System.out.println("hibernate started working successfully " + session);
    }
}
