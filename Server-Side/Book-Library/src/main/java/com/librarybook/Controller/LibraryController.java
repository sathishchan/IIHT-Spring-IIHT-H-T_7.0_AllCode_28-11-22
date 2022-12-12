package com.librarybook.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.librarybook.Entity.Library;
import com.librarybook.Service.ILibraryService;

@RestController
public class LibraryController {
	
	@Autowired
	private ILibraryService libraryService;
	
	@PostMapping("/add/book")
	Integer createLibrary(@RequestBody Library library) {
		Integer id = libraryService.saveLibrary(library);
		System.out.println(id);
		return id;
	}
	
	@GetMapping("/read/{id}")
	public Optional<Library> getLibrary(@PathVariable Integer id) {
		Optional<Library> library = libraryService.getLibrary(id);
		return library;
	}

	@GetMapping("/allbooks")
	public List<Library> getAllLibraryBooks() {
		return libraryService.getAllLibraryBooks();
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Library> updateLibrary(@PathVariable("id") Integer id, @RequestBody Library library) {
		return new ResponseEntity<Library>(libraryService.updateLibrary(library, id), HttpStatus.OK);
	}
	
	@PutMapping("/borrow/{id}")
	public ResponseEntity<Library> updateLibraryBorrowStatus(@PathVariable("id") Integer id, @RequestBody Library library) {
		return new ResponseEntity<Library>(libraryService.updateLibraryBorrowStatus(library, id), HttpStatus.OK);
	}
	
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<Library> deleteLibrary(@PathVariable Integer id) {
		System.out.println(id);
		ResponseEntity<Library> responseEntity = new ResponseEntity<>(HttpStatus.OK);
		try {
			libraryService.deleteLibrarybook(id);
		} catch(Exception e) {
			e.printStackTrace();
			responseEntity = new ResponseEntity<Library>(HttpStatus.NOT_FOUND);
		}
		return responseEntity;
	}
	
}
