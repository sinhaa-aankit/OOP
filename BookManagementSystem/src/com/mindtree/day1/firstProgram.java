package com.mindtree.day1;

import java.util.Scanner;

public class firstProgram {
	
			//Problem Statemnt:
			//take a range as input from the user
			//Perform the below operation with a menu driven program
			//1. Show all  even numbers between the range
			//2. Show all odd numbers between the range
			//3. show all numbers divisble by 3
			//4. Exit
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the statrt point of the range"); 
		int startPoint = sc.nextInt(); 
		System.out.println("Enter the end point of the range"); int
		endPoint = sc.nextInt();
		
		boolean exitMenu = true;
		do {
		System.out.println("Menu");
		System.out.println("1. Show all even numbers");
		System.out.println("2. Show all odd numbers");
		System.out.println("3. Show all numbers divisble by 3");
		System.out.println("4. Exit");
		
		System.out.println("Choose the menu option");
		
		int menuOpt = sc.nextInt();
		
		switch (menuOpt) {
		case 1:
			System.out.println("The numbers are:");
			printEvenNumbers(startPoint, endPoint);
			break;
		case 2:
			System.out.println("The numbers are:");
			printOddNumbers(startPoint, endPoint);
			break;
		case 3:
			System.out.println("The numbers are: ");
			printNumbersDivisbleByThree(startPoint, endPoint);
			break;
		case 4:
			System.out.println("Exiting from menu");
			exitMenu = false;
			break;
		default:
			System.out.println("Invalid option");
			break;
		}
		
		} while (exitMenu);
		/*
		 * 
		 * 
		 * //Take the range as input
		 * System.out.println("Enter the statrt point of the range"); int startPoint =
		 * sc.nextInt(); System.out.println("Enter the end point of the range"); int
		 * endPoint = sc.nextInt();
		 * 
		 * //Run a loop to cover the range //Inside the loop, check if the number is
		 * even, odd or divisble by 3 //Print the number accordingly
		 */		
	}

			private static void printNumbersDivisbleByThree(int startPoint, int endPoint) {
		
				for(int i=startPoint; i<endPoint; i++) {
					if(i%3 == 0) {
						System.out.println(i);
					}
				}
	}

			private static void printOddNumbers(int startPoint, int endPoint) {
				
				for(int i=startPoint; i<endPoint; i++) {
					if (i%2 != 0) {
						System.out.println(i);
					}
				}
		
	}

			private static void printEvenNumbers(int startPoint, int endPoint) {
				for(int i=startPoint; i<endPoint; i++) {
					if(i %2 == 0) {
						System.out.println(i);
					} 
				}
				
			}

}
