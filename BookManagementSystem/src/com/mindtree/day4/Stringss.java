package com.mindtree.day4;


public class Stringss {
	public static void main(String[] args) {
		String str1 = "CTea";
		String str2 = "CTea";
		String str3 = new String("CTea");
		String str4 = new String("CTea");
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str2 == str3);
		System.out.println(str3 == str4);
	}
}
