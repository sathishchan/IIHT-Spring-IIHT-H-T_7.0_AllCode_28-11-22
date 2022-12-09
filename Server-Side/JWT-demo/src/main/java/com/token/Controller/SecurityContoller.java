package com.token.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityContoller {
	
	@GetMapping("/")
	public String home() {
		return "Hello and welcome to home page";
	}

}
