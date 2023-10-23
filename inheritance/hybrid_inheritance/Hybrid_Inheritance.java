package com.kn.hybrid_inheritance;

public class Hybrid_Inheritance {

	public static void main(String[] args) {
		Engineering_Student es = new Engineering_Student();
		es.name = "Rohan";
		System.out.println("Name of an Engineering Student is : " + es.name);

		Medical_Student ms = new Medical_Student();
		ms.name = "Jackson";
		System.out.println("Name of a Medical Student is : " + ms.name);

		Java_Trainer jt = new Java_Trainer();
		jt.name = "Arun";
		System.out.println("Name of a Java Trainer is : " + jt.name);

		SQL_Trainer st = new SQL_Trainer();
		st.name = "Harry";
		System.out.println("Name of a SQL Trainer is : " + st.name);

	}

}
