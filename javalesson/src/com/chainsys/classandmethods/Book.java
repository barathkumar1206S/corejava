package com.chainsys.classandmethods;

public class Book {
	private final String bookId;
	private int yearOfPublishing ;
	private String authorName;
	private String bookName;
	private int bookPrice;
	
	public Book(String bId) {
		this.bookId=bId;
	}

	public String getBookId() {
		return bookId;
	}

	public int getYearOfPublishing() {
		return yearOfPublishing;
	}

	public void setYearOfPublishing(int yearOfPublishing) {
		this.yearOfPublishing = yearOfPublishing;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

}
