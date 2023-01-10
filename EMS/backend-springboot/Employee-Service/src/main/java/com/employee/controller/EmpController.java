package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.User;
import com.employee.service.IEmpService;

@RestController
public class EmpController {
	
	@Autowired
	private IEmpService iEmpService;

	
	@PostMapping("/employee")
	User createEmployee(@RequestBody User user) {
		Long id = iEmpService.saveEmployee(user);
		System.out.println(id);
		return user;
	}
}
