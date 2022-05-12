package com.chainsys.unittest;

import com.chainsys.classandmethods.Book;

public class BookTester {
	public static void testBook() {

	Book firstBook=new Book ("1234");
	firstBook.setAuthorName("William");
	firstBook.setBookName("Juiels ceaser");
	firstBook.setYearOfPublishing(1950);
	firstBook.setBookPrice(250);
	System.out.println(firstBook.getAuthorName());
	System.out.println(firstBook.getBookId());
	System.out.println(firstBook.getBookName());
	System.out.println(firstBook.getYearOfPublishing());
	System.out.println(firstBook.getBookPrice());
	
	}
	
}