package com.mindtree.day7;

import java.util.Scanner;

public class BookStoreApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		BookStore[] stores = new BookStore[5];
		int idx = 0;

		boolean check = true;
		do {
			System.out.println("Menu:");
			System.out.println("1. Add Book Store Details.");
			System.out.println("2. Show Books from a particular Store.");
			System.out.println("3. Search the Books in all Book Store.");
			System.out.println("4. Exit.");

			int menu = sc.nextInt();

			switch (menu) {
				case 1:
					if (idx < 5) {
						addBookStoreDetails(stores, idx, sc);
						idx++;
					} else {
						System.out.println("Array Full, Can not add more");
					}
					break;
				case 2:
					System.out.println("Enter the Book Store Name to See Available Books : ");
					String bookStoreName = sc.next();
					showBooks(stores, idx, bookStoreName);
					break;
				case 3:
					System.out.println("Enter the Book Name to Search: ");
					String bookName = sc.next();
					searchBook(stores, idx, bookName);
					break;
				case 4:
					check = false;
					break;
				default:
					System.out.println("Invalid Option");
					break;

			}

		} while (check == true);

	}

	private static void searchBook(BookStore[] stores, int idx, String bookName) {

		for (int i = 0; i < idx; i++) {
			Book[] books = stores[i].getBooks();
			int len = books.length;
			for (int j = 0; j < len; j++) {
				if (bookName.equals(books[j].getBookName())) {
					System.out.println("Found Book in " + stores[i].getBookStoreName());
					return;
				}
			}
		}
		System.out.println("Book not Found ");
		return;

	}

	private static void showBooks(BookStore[] stores, int idx, String bookStoreName) {
		for (int i = 0; i < idx; i++) {
			if (stores[i].getBookStoreName().equals(bookStoreName)) {
				Book[] books = stores[i].getBooks();
				int len = books.length;
				if (len == 0) {
					System.out.println("No Books Available in " + bookStoreName + ": ");
					return;
				}
				System.out.println("Available Books in " + bookStoreName + ": ");
				for (int j = 0; j < books.length; j++) {
					System.out.println(books[j].toString());
				}
				return;
			}
		}

		System.out.println("Book Store not Found ");
		return;

	}

	private static void addBookStoreDetails(BookStore[] stores, int idx, Scanner sc) {
		// TODO Auto-generated method stub
		System.out.print("Enter Book Store ID, Name, Rating : ");
		int storeId = sc.nextInt();
		String storeName = sc.next();
		float storeRating = sc.nextFloat();
		System.out.println("Enter Number of Books");
		int n = sc.nextInt();
		Book[] books = new Book[n];
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter Book " + i + " Id, Name, Price: ");
			int bookId = sc.nextInt();
			String bookName = sc.next();
			int bookPrice = sc.nextInt();
			books[i - 1] = new Book(bookId, bookName, bookPrice);
		}

		stores[idx] = new BookStore(storeId, storeName, storeRating, books);

	}

}
