//a x b = LCM(a, b) * GCD (a, b)
//LCM(a, b) = (a x b) / GCD(a, b)

package com.kn.javaNumberPrograms;

public class LCMofTwoNumbers {
	// The Driver method
	public static void main(String[] args)
	{
		int a = 25, b = 15;
		System.out.println("LCM of " + a + " and " + b
				+ " is " + LCM(a, b));
	}
	
	
	// Gcd of a and b using recursive method
    static int GCD(int a, int b)
    {
        if (a == 0) {
            return b;
        }
        return GCD(b % a, a);
        }
 
    // LCM of two numbers
    static int LCM(int a, int b)
    {
        return (a / GCD(a, b)) * b;
    }
 
}
