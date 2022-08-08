package com.mindtree.day1;

import java.util.Scanner;

public class StringManipulation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int len = str.length(); 		 // length of string
		char charAtIdx = str.charAt(0);  //char at Index
//		System.out.println( charAtIdx ); //Printing that char
		
		//PROBLEM STATEMENT:-
		//Create a string and print Alternate character.
		// I/P = L&T-Mindtree
		//O/P = LTMnte
		
//		for (int i=0; i<str.length(); i+=2) {// (i=i+2) == (i+=2)
//			System.out.print( str.charAt(i) );
//		}
//		
		//Problem Statement
		// Print Vowels in UpperCase
		// I/P = L&T-Mindtree
		// O/P = L&T-MIndtrEE
//		for(int i=0; i<str.length(); i++) {
//			char ch = str.charAt(i);
//			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
//				ch -= 32;
//				System.out.print(ch);
//			}else {
//				System.out.print(ch);
//			}
//		}
		
		
		
		
		// Problem Statement:-
		// From the String Print the word with the most number of Vowels.
		// I/P - CTEA - Center of Technology and Engineering Academy
		// O/P - Engineering
		int vowelCount=0, maxCount=0;
		String ans="", tempString = "";
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == ' ' || i == str.length()-1 ) {
				for(int j=0; j<tempString.length(); j++) {
					char ct = tempString.charAt(j);
					if(ct == 'a' || ct == 'e' || ct == 'i' || ct == 'o' || ct == 'u') {
						vowelCount++;
					}else if(ct == 'A' || ct == 'E' || ct == 'I' || ct == 'O' || ct == 'U') {
						vowelCount++;
					}
				}
				if(maxCount < vowelCount) {
					maxCount = vowelCount;
					ans = tempString;
				}
				tempString = "";
				vowelCount = 0;
			}else {
				tempString += ch;
			}
		}
		System.out.print(ans);
		
		
		
		
		
	}
}
