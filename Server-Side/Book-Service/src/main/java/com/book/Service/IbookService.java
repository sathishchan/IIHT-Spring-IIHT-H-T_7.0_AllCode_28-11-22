package com.book.Service;

import java.util.List;

import com.book.Entity.Book;
import com.book.Entity.BookSearch;

public interface IbookService {
	
	//Author create book
	Long saveBook (Book book);
	
	//Author update book
	Book updateBook(Book book, Long id);
	
	//search book
	public List<Book> searchBook(BookSearch search);
	
	
	
	
	
	//subscription
	//public Long subscribeBook(Long bookId, SubscribeDetails subDetails);
	//public Integer unsubscribeBook(Long subId, SubscribeDetails subDetails);
	//public void getAllSubscribedBooks(String subName);
	//public Book getBookBySubscribedId(String subName, Long subscribedId);

}
