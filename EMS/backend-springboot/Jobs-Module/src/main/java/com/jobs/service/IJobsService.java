package com.jobs.service;

import java.util.List;

import com.jobs.entity.Jobs;

public interface IJobsService {
	
	Long saveJobs (Jobs jobs);
	
	public List<Jobs> getalljobs();

}
