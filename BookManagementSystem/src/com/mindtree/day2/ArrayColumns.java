package com.mindtree.day2;

import java.util.Scanner;

public class ArrayColumns {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[][] = new int[3][3];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("First column values are: ");
		
		for(int i=0; i < arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(j == 0) {
					System.out.println(arr[i][j]);
				}
			}
		}
		
		

	}

}
