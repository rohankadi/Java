package com.kn.encapsulation;

public class TextBookDemo {
   public static void main(String[] args) {
	
	  TextBook t = new TextBook();
	  
	  
	  System.out.println("Old Page number : " + t.getPageNumber());
	  t.setPageNumber(-20);
	  System.out.println("Current Page number : " + t.getPageNumber());
	  
}
}
