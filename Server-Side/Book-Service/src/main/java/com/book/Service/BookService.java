package com.book.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.Entity.Book;
import com.book.Entity.BookSearch;
import com.book.Exception.ResourceNotFoundExceptionHandler;
import com.book.repo.IBookRepo;


@Service
public class BookService implements IbookService {
	
	@Autowired
	private IBookRepo iBookRepo;
	
	@Override
	public Long saveBook(Book book) {
		Book saveBook = iBookRepo.save(book);
		return saveBook.getId();
	}

	
	@Override
	public Book updateBook(Book book, Long id) {
		Book existingBook = iBookRepo.findById(id).orElseThrow(
			() -> new ResourceNotFoundExceptionHandler("Book", "id", id));
		
		existingBook.setTitle(book.getTitle());
		existingBook.setImage(book.getImage());
		existingBook.setCategory(book.getCategory());
		existingBook.setPrice(book.getPrice());
		existingBook.setAuthor(book.getAuthor());
		existingBook.setPublisher(book.getPublisher());
		existingBook.setPublishedDate(book.getPublishedDate());
		existingBook.setIs_active(book.getIs_active());
		existingBook.setBookContent(book.getBookContent());
		
		
		iBookRepo.save(existingBook);
		return existingBook;
	}


	@Override
	public List<Book> searchBook(BookSearch search) {
				return iBookRepo.searchBooks(search.getTitle() , search.getAuthor(), search.getPublisher(), search.getCategory());
		
	}


	
}

//	@Override
//	public void getAllSubscribedBooks(String subName) {
//		return ;
//	}


	//@Override
	//public Book getBookBySubscribedId(String subName, Long subscribedId) {
	//	return iBookSubscriptionRepo.findbookBySubscriptionIdandUsername(subName, subscribedId);
	//}





