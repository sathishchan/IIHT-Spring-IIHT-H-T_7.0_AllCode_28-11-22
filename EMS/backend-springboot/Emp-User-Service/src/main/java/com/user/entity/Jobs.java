package com.user.entity;

import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;


public class Jobs {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(unique=true)
	private String jobname;
	@JsonFormat(pattern="HH:mm")
	private LocalTime startingtime;
	@JsonFormat(pattern="HH:mm")
	private LocalTime endtime;
	private Long profitvalue;
	private String applicablerole;
	private String status;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private LocalDateTime jobstarttime;
	
	public Jobs(Long id, String jobname, LocalTime startingtime, LocalTime endtime, Long profitvalue,
			String applicablerole, String status, LocalDateTime jobstarttime) {
		super();
		this.id = id;
		this.jobname = jobname;
		this.startingtime = startingtime;
		this.endtime = endtime;
		this.profitvalue = profitvalue;
		this.applicablerole = applicablerole;
		this.status = status;
		this.jobstarttime = jobstarttime;
	}

	public Jobs() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getJobname() {
		return jobname;
	}

	public void setJobname(String jobname) {
		this.jobname = jobname;
	}

	public LocalTime getStartingtime() {
		return startingtime;
	}

	public void setStartingtime(LocalTime startingtime) {
		this.startingtime = startingtime;
	}

	public LocalTime getEndtime() {
		return endtime;
	}

	public void setEndtime(LocalTime endtime) {
		this.endtime = endtime;
	}

	public Long getProfitvalue() {
		return profitvalue;
	}

	public void setProfitvalue(Long profitvalue) {
		this.profitvalue = profitvalue;
	}

	public String getApplicablerole() {
		return applicablerole;
	}

	public void setApplicablerole(String applicablerole) {
		this.applicablerole = applicablerole;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDateTime getJobstarttime() {
		return jobstarttime;
	}

	public void setJobstarttime(LocalDateTime jobstarttime) {
		this.jobstarttime = jobstarttime;
	}

	@Override
	public String toString() {
		return "Jobs [id=" + id + ", jobname=" + jobname + ", startingtime=" + startingtime + ", endtime=" + endtime
				+ ", profitvalue=" + profitvalue + ", applicablerole=" + applicablerole + ", status=" + status
				+ ", jobstarttime=" + jobstarttime + "]";
	}

}