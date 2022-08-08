package com.mindtree.day7;

public class BookStore {
	int bookStoreId;
	String bookStoreName;
	float bookStoreRating;
	Book[] books;
	public BookStore(int bookStoreId, String bookStoreName, float bookStoreRating, Book[] books) {
		super();
		this.bookStoreId = bookStoreId;
		this.bookStoreName = bookStoreName;
		this.bookStoreRating = bookStoreRating;
		this.books = books;
	}
	public int getBookStoreId() {
		return bookStoreId;
	}
	public void setBookStoreId(int bookStoreId) {
		this.bookStoreId = bookStoreId;
	}
	public String getBookStoreName() {
		return bookStoreName;
	}
	public void setBookStoreName(String bookStoreName) {
		this.bookStoreName = bookStoreName;
	}
	public float getBookStoreRating() {
		return bookStoreRating;
	}
	public void setBookStoreRating(float bookStoreRating) {
		this.bookStoreRating = bookStoreRating;
	}
	public Book[] getBooks() {
		return books;
	}
	public void setBooks(Book[] books) {
		this.books = books;
	}
	
}
