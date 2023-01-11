package com.jobs.service;

import java.util.List;

import com.jobs.entity.Jobs;

public interface IJobsService {
	
	//create job
	Long saveJobs (Jobs jobs);
	
	//get all jobs
	public List<Jobs> getAllJobs();
	
	//update job
	Jobs updateJobs(Jobs jobs, Long id);

}
