package com.emp.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long empid;
	private Long userid;
	private String firstname;
	private String lastname;
	private String email;
	private Long salary;
	private String job;
	private Long jobid;
	
	public Employee(Long empid, Long userid, String firstname, String lastname, String email, Long salary, String job,
			Long jobid) {
		super();
		this.empid = empid;
		this.userid = userid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.salary = salary;
		this.job = job;
		this.jobid = jobid;
	}

	public Employee() {
		super();
	}

	public Long getEmpid() {
		return empid;
	}

	public void setEmpid(Long empid) {
		this.empid = empid;
	}

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Long getJobid() {
		return jobid;
	}

	public void setJobid(Long jobid) {
		this.jobid = jobid;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", userid=" + userid + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", email=" + email + ", salary=" + salary + ", job=" + job + ", jobid=" + jobid + "]";
	}

}
