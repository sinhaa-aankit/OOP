package com.mindtree.day5;

import java.util.Scanner;

public class StudentApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student st[] = new Student[5];
		int idx = 0;

		boolean exitMenu = true;
		do {
			System.out.println("Menu");
			System.out.println("1. Add Student");
			System.out.println("2. Search & Show");
			System.out.println("3. Update Marks");
			System.out.println("4. Exit");
			System.out.println("Choose the menu option : ");

			int menuOpt = sc.nextInt();

			switch (menuOpt) {
			case 1:
				if (idx < 5) {
					System.out.println("Enter Student ID, Name, Marks & Age:");
					Student studentObj = new Student(sc.nextInt(), sc.next(), sc.nextFloat(), sc.nextInt());
					addStudent(st, idx, studentObj);
					idx++;
				} else {
					System.out.println("Array is full. Cannot Add more Students");
				}
				break;
			case 2:
				System.out.println("Enter Student ID to Search:");
				int id = sc.nextInt();
				searchStudent(st, idx, id);
				break;
			case 3:
				System.out.println("Enter Student ID to Update Marks:");
				int id1 = sc.nextInt();
				System.out.println("Enter Updated Marks:");
				float marks = sc.nextFloat();
				updateStudent(st, idx, id1, marks);
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

	}

	private static void updateStudent(Student[] st, int idx, int id, float marks) {

		int i = 0;
		for (i = 0; i < idx; i++) {
			if (st[i].getId() == id) {
				st[i].setMarks(marks);
				System.out.println("New Marks Updated " + marks);
				break;
			}
		}
		if (i == idx)
			System.out.println("Id Not Found");
		return;

	}

	private static void searchStudent(Student[] st, int idx, int id) {
		int i = 0;
		for (i = 0; i < idx; i++) {
			if (st[i].getId() == id) {
				System.out.println(st[i].toString());
				break;
			}
		}
		if (i == idx)
			System.out.println("Id Not Found");
		return;
	}

	private static void addStudent(Student[] st, int idx, Student studentObj) {
		// TODO Auto-generated method stub
		st[idx] = studentObj;
		return;
	}

}
