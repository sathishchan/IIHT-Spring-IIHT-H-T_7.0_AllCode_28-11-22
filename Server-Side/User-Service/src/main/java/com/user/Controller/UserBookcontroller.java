package com.user.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.Entity.BookSearch;

@RestController
@CrossOrigin("http://localhost:4200/")
public class UserBookcontroller {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping("/search/book")
	public ResponseEntity<?> searchBooks(@RequestBody BookSearch search) {
		// null handling
		search.setTitle(search.getTitle() == "" ? null : search.getTitle());
		search.setAuthor(search.getAuthor() == "" ? null : search.getAuthor());
		search.setPublisher(search.getPublisher() == "" ? null : search.getPublisher());
		search.setCategory(search.getCategory() == "" ? null : search.getCategory());
		List<?> result = restTemplate.postForObject("http://BookService/search", search, List.class);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
}

