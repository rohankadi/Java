package com.kn.arrays;

public class DoubleArrayDemo {

	public static void main(String[] args) {
		//Declaration and Creation
		double[] arr = new double[5];  
		
		//initialization
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
		
		int k = 10;
		for(int i=0; i<arr.length; i++) {
			arr[i] = k;  //10,20,30,40,50,false
			k = k + 10;  //20,30,40,50,60
		}
		
	
		//Array Traversing
	   for(int i=0; i<arr.length; i++) {
		   System.out.println(arr[i]); //10,20,30,40,50
	   }
}
}
