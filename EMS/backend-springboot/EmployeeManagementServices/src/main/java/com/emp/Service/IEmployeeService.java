package com.emp.Service;

import java.util.List;
import java.util.Optional;

import com.emp.Entity.Employee;

public interface IEmployeeService {
	
	public Long saveEmployee(Employee employee);

	public List<Employee> getAllEmployees();
	
	public Optional<Employee> getEmployeesById(Long id);
	
	public void deleteEmployee(Long id);
	
	public Employee updateEmployee(Employee employee ,Long id );
	
	public void updateSalary(Employee employee ,Long id );
}
