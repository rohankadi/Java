package com.kn.gcd;

public class GcdOfTwoNum {

	public int gcd(int n1, int n2) {
		if(n2 == 0) {
			return n1;
		}
		else {
		return gcd(n2 , n1%n2);
	    }
   }
}
