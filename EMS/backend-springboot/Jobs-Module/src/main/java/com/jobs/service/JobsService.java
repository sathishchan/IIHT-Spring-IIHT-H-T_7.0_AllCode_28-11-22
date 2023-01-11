package com.jobs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobs.entity.Jobs;
import com.jobs.exception.ResourceNotFoundExceptionHandler;
import com.jobs.repo.JobsRepo;

@Service
public class JobsService implements IJobsService {
	
	@Autowired
	private JobsRepo jobsRepo;

	//add jobs
	@Override
	public Long saveJobs(Jobs jobs) {
		Jobs savedJobs = jobsRepo.save(jobs);
		return savedJobs.getId();
	}

	//get all jobs
	@Override
	public List<Jobs> getAllJobs() {
		return jobsRepo.findAll();
	}

	//update jobs
	@Override
	public Jobs updateJobs(Jobs jobs, Long id) {
		Jobs existingjobsmodule = jobsRepo.findById(id).orElseThrow(
				() -> new ResourceNotFoundExceptionHandler("Jobs", "id", id));
		
		existingjobsmodule.setJobname(jobs.getJobname());
		existingjobsmodule.setStartingtime(jobs.getStartingtime());
		existingjobsmodule.setEndtime(jobs.getEndtime());
		existingjobsmodule.setProfitvalue(jobs.getProfitvalue());
		existingjobsmodule.setApplicablerole(jobs.getApplicablerole());
		existingjobsmodule.setStatus(jobs.getStatus());
		
		jobsRepo.save(existingjobsmodule);
		return existingjobsmodule;
	}
	
	
}
