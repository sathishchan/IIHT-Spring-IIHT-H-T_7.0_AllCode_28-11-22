package com.jobs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobs.entity.Jobs;
import com.jobs.repo.JobsRepo;

@Service
public class JobsService implements IJobsService {
	
	@Autowired
	private JobsRepo jobsRepo;

	@Override
	public Long saveJobs(Jobs jobs) {
		Jobs savedJobs = jobsRepo.save(jobs);
		return savedJobs.getId();
	}

	@Override
	public List<Jobs> getalljobs() {
		return jobsRepo.findAll() ;
	}
	
	
}
