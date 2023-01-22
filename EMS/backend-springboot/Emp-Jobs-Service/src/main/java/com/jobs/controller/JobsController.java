package com.jobs.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.jobs.entity.Jobs;
import com.jobs.service.IJobsService;


@RestController
public class JobsController {
	
	@Autowired
	private IJobsService iJobsService;
	
	
	
	@PostMapping("/add/Jobs")
	public Long createJobs(@RequestBody Jobs jobs) {
		Long id = iJobsService.saveJobs(jobs);  
		System.out.println(id);
		return id;
	}
	
	@GetMapping("/alljobs")
	public List<Jobs> getalljobs() {
		return iJobsService.getAllJobs();
	}
	
	@GetMapping("/getjob/{id}")
	public Optional<Jobs> getJobs(@PathVariable Long id) {
		Optional<Jobs> jobs = iJobsService.getJob(id);
		return jobs;
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Jobs> updateJobs(@PathVariable("id") Long id, @RequestBody Jobs jobs) {
		return new ResponseEntity<Jobs>(iJobsService.updateJobs(jobs, id), HttpStatus.OK);
	}
	
	@PutMapping("/updatejobtimestatus")
	public void updateJobAndSalary(@RequestBody Jobs jobs) {
		iJobsService.updateJobAndSalary(jobs);
	}
	
	@GetMapping("/jobtimecheck/{currentjob}/{newjob}")
	public Boolean jobtimecheck(@PathVariable("currentjob") String currentjob, @PathVariable("newjob") String newjob) {
		return iJobsService.jobtimecheck(currentjob, newjob);
	}

}
