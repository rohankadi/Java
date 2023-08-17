package com.kn.arrays;

import java.util.Scanner;

public class PresentInArrayOrNot1 {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    //Array Declaration and Creation
    System.out.print("Enter the Size of the Array = ");
    int[] arr = new int[scan.nextInt()];
    
    //Array Initialization
    for(int i=0; i<arr.length; i++) {
    	System.out.println("Enter the integer data for the element " + (i+1)+ " : ");
    	arr[i] = scan.nextInt();
    }
    
    //Taking element to be found
    System.out.println("Enter the Element to be found : ");
    int ele = scan.nextInt();
    
    boolean flag = isElementPresentOrNot(arr, ele);
    if(flag) {
    	System.out.println("The Element " + ele + " is found");
    }
    else {
    	System.out.println("The Element " + ele + " is not found");
    }
    scan.close();
    
	}

	//Method to find the element Present or not in Array
	public static boolean isElementPresentOrNot(int[] arr, int ele) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == ele) {
				return true;
			}
		}
		return false;
	}

}
