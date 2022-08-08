package com.mindtree.day6;

import java.util.Scanner;

public class insertionSort {

	public static void insertionSort(int arr[]) {
		int n = arr.length;
		for(int i=0; i<n; i++) {
			int key = arr[i];
			int j = i-1;
			while(j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		insertionSort(arr);
		
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		

	}


}
