//import comes under Java source-file structure
package com.importStatement;

import java.util.ArrayList;

public class ImportStatement1 {
	public static void main(String[] args) {
		
        //ArrayList l = new ArrayList(); //get Error cz there is no ArrayList class is present or imported
		/*
		java.util.ArrayList l = new java.util.ArrayList(); //fully qualified Name 
		
		//If we want its 5times then it's become readability problem 
		    and length of code also will be increased
		java.util.ArrayList l = new java.util.ArrayList(); //fully qualified Name 
		java.util.ArrayList l = new java.util.ArrayList(); //fully qualified Name 
		java.util.ArrayList l = new java.util.ArrayList(); //fully qualified Name 
		java.util.ArrayList l = new java.util.ArrayList(); //fully qualified Name 
		*/
		
		//instead of doing this we can directly import ArrayList from java.util 
		ArrayList l = new ArrayList(); //no need to use fully-Qualified name
		
		/*
		//If we want it's 5times then it's gives good readability 
		    and length of code will also be decreased
		ArrayList l = new ArrayList();
		ArrayList l = new ArrayList();
		ArrayList l = new ArrayList();
		ArrayList l = new ArrayList();
	*/
		
		
//**************************** TYPES OF IMPORT *********************************
		
		/*
		01 EXPLICIT class import : java.util.ArrayList, java.util.Scanner;
		 which we can import Particular class from java package.
		 ----> readability wise too good
		*/
		
		/*
		02 IMPLICIT class import : java.util.*;
		which we can import all classes present inside java package 
		 */
		
		/*
		 *Ex : 01 Implicit import
		 *import com.hdfc.*;
		 *import com.icici.*;
		 *
		 *Account a = new Account();
		 *Loan l = new Loan();
		 
		 
		 //so we don't know from which package we are getting account, loan classes ???
		  that's creates a problem, so that's the reason better to go for 
		  EXPLICIT import (particular class import)
		  
		  Ex : 02 Explicit import
		  import com.hdfc.Account;
		  import com.icici.Loan;
		  
		  *Account a = new Account();
		  *Loan l = new Loan();
		 */			
	}
}
