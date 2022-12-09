package com.user.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.Entity.User;
import com.user.Service.IuserService;

@RestController
public class UserController {

	@Autowired
	private IuserService userservice;
	
	@PostMapping("/add")
	Integer createUser(@RequestBody User user) {
		Integer userID = userservice.saveUser(user);
		System.out.println(userID);
		return userID;
	}
}
