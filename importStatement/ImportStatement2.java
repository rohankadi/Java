//import comes under Java source-file structure
package com.importStatement;

public class ImportStatement2 {
    public static void main(String[] args) {
		/*I
    	01. java.lang package 
    	is no need to import java.lang package by default this class is present / available
    	*/
    	
    	/*
    	 02. default package ==> Current working directory or same package 
    	 no need to write import statement
    	 
    	 => if we want to access outside package classes then import statement is required
    	  */
    	
    
    	//01 Example => java.lang package is not required 
    	String s = new String("Durga");
    	StringBuffer sb = new StringBuffer("Durga Soft");
    	Exception e = new Exception();
    	Thread t = new Thread();
        Integer i= new Integer(10);
        
        //02 present in default package, no need of import statement
        Student st = new Student();
        st.m1();	
	}
}
