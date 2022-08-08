package com.mindtree.day1;

import java.util.Scanner;

public class PrintStringwithMostVowelCount {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String inputStr = sc.nextLine();
		
		String word = "";
		String outputWord = "";
		int vouwelCount =0;
		int maxVowelCount = 0;
		//Welcome to L&T Mysore Campus
	
		for(int i=0; i<inputStr.length(); i++) {
			if(inputStr.charAt(i) == 'a' || inputStr.charAt(i) == 'e' ||inputStr.charAt(i) == 'i' ||inputStr.charAt(i) == 'o' ||
					inputStr.charAt(i) == 'u' || inputStr.charAt(i) == 'A' || inputStr.charAt(i) == 'E' || 
					inputStr.charAt(i) == 'I' || inputStr.charAt(i) == 'O' || inputStr.charAt(i) == 'U' ) {
				vouwelCount++;
			}
			if(inputStr.charAt(i) == ' ') {
				if (vouwelCount > maxVowelCount) {
					maxVowelCount = vouwelCount;
					outputWord = word;
				}
				vouwelCount = 0;
				word = "";
			} else {
				word = word + inputStr.charAt(i);
			}
		}
		if (vouwelCount > maxVowelCount) {
			maxVowelCount = vouwelCount;
			outputWord = word;
		}
		
		System.out.println(outputWord);

	}

}
