package com.book.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.book.Entity.Book;
import com.book.Entity.BookSearch;
import com.book.Service.IbookService;

@RestController
public class BookController {
	
	
	
	@Autowired
	private IbookService iBookService;
	
	
	@PostMapping("/createBook")
	Long createBook(@RequestBody Book book) {
		Long id = iBookService.saveBook(book);
		System.out.println(id);
		return id;
	}
	
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Book> updateBook(@PathVariable("id") Long id, @RequestBody Book book) {
		return new ResponseEntity<Book>(iBookService.updateBook(book, id), HttpStatus.OK );
	}
	
	
	@PostMapping("/search")
	public ResponseEntity<?> searchBooks(@RequestBody BookSearch bookSearch) {
		return new ResponseEntity<>(iBookService.searchBook(bookSearch), HttpStatus.OK);
	}

}
