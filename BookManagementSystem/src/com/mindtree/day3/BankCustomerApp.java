package com.mindtree.day3;

import java.util.Scanner;

public class BankCustomerApp {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BankCustomerDetails[] arr = new BankCustomerDetails[3];
		for(int i=0; i<3; i++) {
			arr[i] = new BankCustomerDetails();
			System.out.println("Enter Customer ID: ");
			arr[i].setCustId(sc.nextInt());
			System.out.println("Enter customer name: ");
			arr[i].setCustName(sc.next());
			System.out.println("Enter customer mobile number: ");
			arr[i].setMobileNo(sc.nextLong());
			System.out.println("Enter Customer address: ");
			arr[i].setAddress(sc.next());
			System.out.println("Enter customer balance");
			arr[i].setBalance(sc.nextDouble());
		}
	
		
		System.out.println("Bank Customer Details");
		for(int i=0; i<3; i++) {
			System.out.println(arr[i].getCustId() + "|" + arr[i].getName() + "|" +
					arr[i].getMobNo() + "|" + arr[i].getAddres() + "|" +
					arr[i].getBalance());
		}
		
		
//		arr[1] = new BankCustomerDetails(102, "Geerisha", 67898678, "CTEA", 3453453);
		
//		System.out.println(arr[1].getCustId() + "|" + arr[1].getName() + "|" +
//				arr[1].getMobNo() + "|" + arr[1].getAddres() + "|" +
//				arr[1].getBalance());
	}

}
