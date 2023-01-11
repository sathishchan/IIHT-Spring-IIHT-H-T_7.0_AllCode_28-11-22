package com.jobs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jobs.entity.Jobs;
import com.jobs.service.IJobsService;

@RestController
public class JobsController {
	
	@Autowired
	private IJobsService iJobsService;
	
	@PostMapping("/add/Jobs")
	public Long createLibrary(@RequestBody Jobs jobs) {
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		Long id = iJobsService.saveJobs(jobs);  
		System.out.println(id);
		return id;
	}
	
	@GetMapping("/alljobs")
	public List<Jobs> getalljobs() {
		return iJobsService.getalljobs();  
	}

}
