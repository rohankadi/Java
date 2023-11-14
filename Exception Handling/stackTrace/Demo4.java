package com.rk.stackTrace;

public class Demo4 {
	public static void main(String[] args) {
		try {
			Demo3 demo3 = new Demo3();
			demo3.beta();
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		} 
	}
}
