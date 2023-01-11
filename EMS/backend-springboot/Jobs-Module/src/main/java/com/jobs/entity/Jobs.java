package com.jobs.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Jobs {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Date startingtime;
	private Date endtime;
	private Long profitvalue;
	@Enumerated(EnumType.STRING)
	private Status status;
	
	public Jobs(Long id, Date startingtime, Date endtime, Long profitvalue, Status status) {
		super();
		this.id = id;
		this.startingtime = startingtime;
		this.endtime = endtime;
		this.profitvalue = profitvalue;
		this.status = status;
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

	public Date getStartingtime() {
		return startingtime;
	}

	public void setStartingtime(Date startingtime) {
		this.startingtime = startingtime;
	}

	public Date getEndtime() {
		return endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	public Long getProfitvalue() {
		return profitvalue;
	}

	public void setProfitvalue(Long profitvalue) {
		this.profitvalue = profitvalue;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Jobs [id=" + id + ", startingtime=" + startingtime + ", endtime=" + endtime + ", profitvalue="
				+ profitvalue + ", status=" + status + "]";
	}

}
