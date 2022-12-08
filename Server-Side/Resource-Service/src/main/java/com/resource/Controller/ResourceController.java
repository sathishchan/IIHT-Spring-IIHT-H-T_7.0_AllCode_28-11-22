package com.resource.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.resource.Entity.Resource;
import com.resource.Service.IResourceService;

@RestController
@RequestMapping("/resource")
public class ResourceController {
	

	@Autowired
	private IResourceService resourceService;
	
	@GetMapping("/hr/{userID}")
	public List<Resource> getResource(@PathVariable("userID") Long userID) {
		return this.resourceService.getResourceForUsers(userID);
	}
}
