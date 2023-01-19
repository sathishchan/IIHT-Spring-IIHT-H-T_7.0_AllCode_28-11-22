package com.emp.Service;

import java.util.List;
import java.util.Optional;

import com.emp.Entity.Employee;

public interface IEmployeeService {
	
	//create employee
	public Long saveEmployee(Employee employee);

	//get all employee
	public List<Employee> getAllEmployees();
	
	//get employee by id
	public Optional<Employee> getEmployeesById(Long id);
	
	//delete employee
	public void deleteEmployee(Long id);
	
	//update employee
	public Employee updateEmployee(Employee employee ,Long id );
	
	public void updateJobSalary(Employee employee,Long id);
	
	public String jobcheck(Long id);
}
