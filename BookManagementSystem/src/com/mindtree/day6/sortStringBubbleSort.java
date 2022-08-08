package com.mindtree.day6;

import java.util.Scanner;

public class sortStringBubbleSort {

	// Asc
	public static void bubbleSort(String arr[]) {
		int n = arr.length;
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-i-1; j++) {
				if(arr[j].compareTo(arr[j+1]) > 0) {
					String temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.next();
		}
		System.out.println(arr[0].compareTo(arr[2]));
		bubbleSort(arr);
		System.out.println(arr[0].compareTo(arr[2]));
		
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
