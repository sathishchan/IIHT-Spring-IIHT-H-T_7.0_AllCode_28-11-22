package com.hr.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hr.Entity.HR;
import com.hr.Service.IhrService;

@RestController
@RequestMapping("/hr")
public class HrController {
	
	@Autowired
	private IhrService hrService;
	
	@GetMapping("/{userID}")
	public HR getHr(@PathVariable("userID") Long userID) {
		HR hr = this.hrService.getHR(userID);
		return hr;
	}

}
