package com.book.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.book.Entity.Book;
import com.book.Entity.BookSearch;
import com.book.Service.IbookService;

@RestController
@CrossOrigin(origins ="*", allowedHeaders = "*")
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
	public ResponseEntity<?> searchBooks(@RequestBody BookSearch search) {
		return new ResponseEntity<>(iBookService.searchBook(search), HttpStatus.OK);
	}
	
	
	
	

//	@GetMapping("/getall/by-user/{subName}")
//	public ResponseEntity<?> getAllByUser(@PathVariable String subName) {
////		return new ResponseEntity<>(iBookService.getAllSubscribedBooks(subName), HttpStatus.OK);
//	}

	//@GetMapping("/get/{subId}/by-user/{subName}")
	//public ResponseEntity<?> getBookByUserAndSubId(@PathVariable String subName, @PathVariable Long subId) {
		//return new ResponseEntity<>(iBookService.getBookBySubscribedId(subName, subId), HttpStatus.OK);
	//}
	
}
