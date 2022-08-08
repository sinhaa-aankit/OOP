package com.mindtree.day2;

import java.util.Scanner;

public class ArrayProb1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		
//		int arr[] = new int[5];
//		
//		System.out.println("Enter the array values:");
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//		System.out.println("Array values are: ");
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		int arr[][] = new int[3][3];
		System.out.println("Enter the array values:");
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Array values are :");
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
