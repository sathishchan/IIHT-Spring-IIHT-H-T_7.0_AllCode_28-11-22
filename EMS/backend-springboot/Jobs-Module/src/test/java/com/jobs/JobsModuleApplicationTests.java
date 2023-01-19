package com.jobs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalDateTime;
import java.time.LocalTime;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.jobs.entity.Jobs;
import com.jobs.entity.Status;
import com.jobs.repo.JobsRepo;
import com.jobs.service.IJobsService;


@SpringBootTest
class JobsModuleApplicationTests {
	
	@Autowired
	private IJobsService iJobsService;
	
	@MockBean
	private JobsRepo jobsRepo;

	@Test
	void contextLoads() {
	}
	
	
	@Test
	public void createJobTest() {
		Jobs jobs = new Jobs(Long.valueOf(1L),"job1",LocalTime.now(),LocalTime.now(),Long.valueOf(500L),"user",Status.notstarted,LocalDateTime.now());
		when(this.jobsRepo.save(jobs)).thenReturn(jobs);
		assertEquals(jobs,iJobsService.saveJobs(jobs));  
	}



}
