//import comes under Java source-file structure
package com.importStatement;
//Error
//import java.*;
//import java.util.*;

//Correct
//import java.util.regex.Pattern;
import java.util.regex.*;

public class ImportStatement3 {

    /*
      1) java.*;
       ->  all packages inside java class and interfaces will be default available,
        but not subclasses packages
      
      2)java.util.*;
      -> we can get all package classes within util subclasses
      
      	=>if i want to access pattern class then we need
           to write import statement until subclasses level,
        
      3)java.util.regex.pattern;
           or
      => java.util.regex.*; 
      so, we can easily access subclass packages (ie.pattern) 
     */
	
	  Pattern p = Pattern.compile("ab");
	
	
}
