package com.kn.capitalizeFirstCharacter;

public class CapitalizeFirstCharacter {

	public static void main(String[] args) {
		String s1 = "i love learning strings in java";
		String[] arr = s1.split(" ");

		for (int i = 0; i <= arr.length - 1; i++) 
		{
		char[] brr = arr[i].toCharArray();
		  for(int j = 0; j <= brr.length - 1; j++) {
			  if(brr[0] >= 97 && brr[0] <= 122) {
				  brr[0] = (char)(brr[0] - 32);
			  }
			  else {
				  brr[0] = brr[0];
			  }
			  System.out.print(brr[j]);
		  }
		  System.out.print(" ");
		}
	}

}
