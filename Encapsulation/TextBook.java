package com.kn.encapsulation;

public class TextBook {
	//1) Make private so, outsider will not access data directly
	//2) Create methods to set and get the data 
	
  private int pageno;
 
 public int getPageNumber() {
	 return pageno;
 }
 
 public void setPageNumber(int a) {
	 if(pageno >= 0) {
		 pageno = a;
	 }
	 else {
		 System.out.println("Enter correct Page Number");
	 }
 }
 
 /*
 public void setPageNumber(int pageno) {
	 if(pageno >= 0 && pageno <= 100) {
		 this.pageno = pageno;
	 }
	 else {
		 System.out.println("Enter correct Page Number");
	 }
  */
 }
