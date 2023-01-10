package com.employee.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;	
	private Long empid;
	private String firstname;
	private String lastname;
	private String email;
	private Long salary;
	private String allocatedJobs;
	
	public Employee(Long id, Long empid, String firstname, String lastname, String email, Long salary,
			String allocatedJobs) {
		super();
		Id = id;
		this.empid = empid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.salary = salary;
		this.allocatedJobs = allocatedJobs;
	}

	public Employee() {
		super();
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Long getEmpid() {
		return empid;
	}

	public void setEmpid(Long empid) {
		this.empid = empid;
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

	public String getAllocatedJobs() {
		return allocatedJobs;
	}

	public void setAllocatedJobs(String allocatedJobs) {
		this.allocatedJobs = allocatedJobs;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", empid=" + empid + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", email=" + email + ", salary=" + salary + ", allocatedJobs=" + allocatedJobs + "]";
	}

}
