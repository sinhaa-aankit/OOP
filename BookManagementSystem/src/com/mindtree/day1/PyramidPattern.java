package com.mindtree.day1;

public class PyramidPattern {
	public static void main(String[] args) {
		int count = 1;
		for(int i=0; i<4; i++) {
			for(int j=4; j>i; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}
	}
}


