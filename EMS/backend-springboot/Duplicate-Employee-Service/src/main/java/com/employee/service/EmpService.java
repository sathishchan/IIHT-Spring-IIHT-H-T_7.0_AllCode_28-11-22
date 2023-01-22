package com.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entity.Employee;
import com.employee.entity.User;
import com.employee.repo.EmpRepo;

@Service
public class EmpService implements IEmpService  {
	
	@Autowired
	private EmpRepo empRepo;

	@Override
	public Long saveEmployee(User user) {
		Employee employee=new Employee();
		employee.setEmpid(user.getId());
		employee.setFirstname(user.getFirstname());
		employee.setLastname(user.getLastname());
		employee.setEmail(user.getEmail());
		
		Employee savedEmployee = empRepo.save(employee);
		return savedEmployee.getId() ;
	}

	
}
