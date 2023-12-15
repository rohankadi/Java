package com.kodnest.hibernate_Project4_ManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	//Creating the list for storing employees
    	List<Employee> emplist1 = new ArrayList<Employee>();
    	List<Employee> emplist2 = new ArrayList<Employee>();
    	List<Employee> emplist3 = new ArrayList<Employee>();
    	List<Employee> emplist4 = new ArrayList<Employee>();
    	
    	//creating objects of Employees
    	Employee emp1 = new Employee();
    	Employee emp2 = new Employee();
    	Employee emp3 = new Employee();
    	Employee emp4 = new Employee();
    	Employee emp5 = new Employee();
    	
    	//Adding the Employee objects to emplist1
    	emplist1.add(emp1);
    	emplist1.add(emp3);
    	emplist1.add(emp5);
    	
    	//Adding the Employee objects to emplist2
    	emplist2.add(emp1);
    	emplist2.add(emp2);
    	emplist2.add(emp4);
    	emplist2.add(emp5);
    	
    	//Adding the Employee objects to emplist3
    	emplist3.add(emp2);
    	emplist3.add(emp4);
    	emplist3.add(emp5);
    	
    	//Adding the Employee objects to emplist4
    	emplist4.add(emp1);
    	emplist4.add(emp2);
    	emplist4.add(emp3);
    	emplist4.add(emp4);
    	emplist4.add(emp5);
    	
    	//********************************************************************************
       
    //Creating the list for storing Technologies
       List<Technology> tech_l1 = new ArrayList<Technology>();
       List<Technology> tech_l2 = new ArrayList<Technology>();
       List<Technology> tech_l3 = new ArrayList<Technology>();
       List<Technology> tech_l4 = new ArrayList<Technology>();
       List<Technology> tech_l5 = new ArrayList<Technology>();
       
       //creating objects of technology
       Technology tech1 = new Technology();
       Technology tech2 = new Technology();
       Technology tech3 = new Technology();
       Technology tech4 = new Technology();
       
     //Adding the Technology object to tech_l1
       tech_l1.add(tech1);
       tech_l1.add(tech2);
       tech_l1.add(tech4);
       
       //Adding the Technology object to tech_l2
       tech_l2.add(tech2);
       tech_l2.add(tech3);
       tech_l2.add(tech4);
       
       //Adding the Technology object to tech_l3
       tech_l3.add(tech1);
       tech_l3.add(tech4);
       
       //Adding the Technology object to tech_l4
       tech_l4.add(tech2);
       tech_l4.add(tech3);
       tech_l4.add(tech4);
       

       //Adding the Technology object to tech_l5
       tech_l5.add(tech1);
       tech_l5.add(tech2);
       tech_l5.add(tech3);
       tech_l5.add(tech4);
       
       
 //********************************************************************************
       //Setting the values for Employee emp1 object
       emp1.setEmployee_id(11);
       emp1.setEmployee_name("prakash");
       emp1.setEmployee_team("Team-A");
       emp1.setTech(tech_l1);    

       //Setting the values for Employee emp2 object
       emp2.setEmployee_id(12);
       emp2.setEmployee_name("praveen");
       emp2.setEmployee_team("Team-B");
       emp2.setTech(tech_l2);
       
       //Setting the values for Employee emp3 object
       emp3.setEmployee_id(13);
       emp3.setEmployee_name("Priya");
       emp3.setEmployee_team("Team-C");
       emp3.setTech(tech_l3);

       //Setting the values for Employee emp1 object
       emp4.setEmployee_id(14);
       emp4.setEmployee_name("Rohan");
       emp4.setEmployee_team("Team-A");
       emp4.setTech(tech_l4);

       //Setting the values for Employee emp1 object
       emp5.setEmployee_id(15);
       emp5.setEmployee_name("Prateek");
       emp5.setEmployee_team("Team-B");
       emp5.setTech(tech_l5);  
       
 //***********************************************************************    

       //Setting the values for Technology tech1 object
       tech1.setTechnlogy_Id(123);
       tech1.setTechnology_Name("Java");
       tech1.setEmployee(emplist1);

       //Setting the values for Technology tech2 object
       tech2.setTechnlogy_Id(124);
       tech2.setTechnology_Name("MySQL");
       tech2.setEmployee(emplist2);      

       //Setting the values for Technology tech3 object
       tech3.setTechnlogy_Id(125);
       tech3.setTechnology_Name("Python");
       tech3.setEmployee(emplist3);
 
       //Setting the values for Technology tech4 object
       tech4.setTechnlogy_Id(126);
       tech4.setTechnology_Name("React");
       tech4.setEmployee(emplist4);     
   
     
    //********************************************************************************
       
       Configuration cnfg = new Configuration();
       cnfg.configure();
       SessionFactory factory = cnfg.buildSessionFactory();
       Session session = factory.openSession();
       Transaction trans = session.beginTransaction();
       
       //save
       session.save(emp1);
       session.save(emp2);
       session.save(emp3);
       session.save(emp4);
       session.save(emp5);
       
       session.save(tech1);
       session.save(tech2);
       session.save(tech3);
       session.save(tech4);
       
       //commit
       trans.commit();
       
       System.out.println("Successfully Added!");

    }
}












