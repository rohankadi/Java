package com.kn.capitalizeFirstCharacter;

public class CapitalizeFirstCharacterByUsingStringBuffer {

	public static String main(String[] args) {
		String s1 = "i love learning strings in java";
		String[] arr = s1.split(" ");

		StringBuffer sb = new StringBuffer();

		for (String s : arr) {
			char[] brr = s.toCharArray();

			if (brr[0] >= 97 && brr[0] <= 122) {
				brr[0] = (char) (brr[0] - 32);
			}

			for (int i = 0; i <= arr.length - 1; i++) {
				sb.append(arr[i]);
			}
		}
		sb.append(" ");
		String result = sb.toString();
		return result.trim();
	}

}
