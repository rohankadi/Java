package com.kn.stringprograms;

public class FindNumOfVowelsConsonantsAndDigits {

	public static void main(String[] args) {
		String str1 = "My name is Rohan 4363 @ $ %";
		String str2 = str1.toLowerCase();
		char[] arr = str2.toCharArray();

		int vowel = 0;
		int consonent = 0;
		int digit = 0;
		int specialCharacter = 0;

		for (int i = 0; i < str2.length(); i++)
		{
			if (arr[i] >= 'a' && arr[i] <= 'z') 
			{
				if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
					vowel++;
				}
				else
				{
					consonent++;
				}
			}
			else if(arr[i] == ' ') {
				
			}
			else if (arr[i] >= '0' && arr[i] <= '9') 
			{
				digit++;
			}
			else 
			{
				specialCharacter++;
			}

		}
		System.out.println("number of vowels = " + vowel);
		System.out.println("number of consonants = " + consonent);
		System.out.println("number of digits = " + digit);
		System.out.println("number of special characters = " + specialCharacter);

	}
}
