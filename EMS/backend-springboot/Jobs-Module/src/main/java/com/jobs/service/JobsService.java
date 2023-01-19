package com.jobs.service;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobs.entity.Jobs;
import com.jobs.entity.Status;
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

	@Override
	public void updateJobAndSalary(Jobs jobs) {
		Jobs existingjobsmodule = jobsRepo.findById(jobs.getId()).orElseThrow(
			 () -> new ResourceNotFoundExceptionHandler("Jobs", "id", jobs.getId()));
		
		if(jobs.getStatus().equals(Status.inprogress)) {
			existingjobsmodule.setJobstarttime(LocalDateTime.now());
		}
		
		if(jobs.getStatus().equals(Status.aborted)) {
			LocalDateTime tempDateTime = LocalDateTime.from(existingjobsmodule.getJobstarttime());
			long minutes = tempDateTime.until(LocalDateTime.now(), ChronoUnit.MINUTES);
			if(minutes <=5) {
				jobs.setStatus(Status.notstarted);
			}
		}
		existingjobsmodule.setStatus(jobs.getStatus());
		jobsRepo.save(existingjobsmodule);
	}

	@Override
	public Boolean jobtimecheck(String currentjob, String newjob) {
		
		List<Jobs> job=jobsRepo.findByJobname(currentjob);
		LocalTime endtime = null;
		for(Jobs jobdata:job) {
			endtime=jobdata.getEndtime();
			break;
		}
		List<Jobs> job2=jobsRepo.findByJobname(newjob);
		LocalTime starttime = null;
		for(Jobs jobdata:job2) {
			starttime=jobdata.getStartingtime();
			break;
		}
		if (endtime.isBefore(starttime)) {
			return true;
		}
		
		return false;
	}

	@Override
	public List<Jobs> getallrolejobs(String role) {
		return jobsRepo.findByApplicablerole(role);
	}

	//get jobs by Id
	@Override
	public Optional<Jobs> getJob(Long id) {
		return jobsRepo.findById(id);
	}
	
	
}
