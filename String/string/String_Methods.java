package com.kn.string;

public class String_Methods {

	public static void main(String[] args) {
		String s1 = "Raja Ram Mohan Roy";
		System.out.println("Uppercase : " + s1.toUpperCase());
		System.out.println("Lowercase : " + s1.toLowerCase());
		System.out.println("Character at given index : " + s1.charAt(2));
		System.out.println("Index of given character : " + s1.indexOf('a'));
		System.out.println("Last Index of given character : " + s1.lastIndexOf('a'));
	}
}