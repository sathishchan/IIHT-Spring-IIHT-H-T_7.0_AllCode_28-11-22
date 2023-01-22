package com.jobs.service;

import java.util.List;
import java.util.Optional;

import com.jobs.entity.Jobs;

public interface IJobsService {
	
	//create job
	Long saveJobs (Jobs jobs);
	
	//get all jobs
	public List<Jobs> getAllJobs();
	
	//update job
	Jobs updateJobs(Jobs jobs, Long id);
	
	public List<Jobs> getallrolejobs(String role);
	
	public void updateJobAndSalary(Jobs jobs);
	
	public Boolean jobtimecheck(String currentjob, String newjob);
	
	//get by Id
	Optional<Jobs> getJob(Long id);

}
