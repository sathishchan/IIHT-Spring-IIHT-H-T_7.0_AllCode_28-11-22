package com.emp.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.Entity.Employee;
import com.emp.Repo.IEmployeeRepo;
import com.emp.exception.ResourceNotFoundException;

@Service
public class EmployeeServiceImpl implements IEmployeeService{

	@Autowired
	private IEmployeeRepo employeeRepo;
	
	@Override
	public Long saveEmployee(Employee employee) {
		Employee saveEmployee =employeeRepo .save(employee);
		return saveEmployee.getEmpid();
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepo.findAll();
	}

	@Override
	public Optional<Employee> getEmployeesById(Long id) {
		// TODO Auto-generated method stub
		List<Employee> employee=employeeRepo.findByUserid(id);
		Long empid = null;
		for(Employee employee2:employee) {
			empid=employee2.getEmpid();
			break;
		}
		return employeeRepo.findById(empid);
	}
	
	public void deleteEmployee(Long id) {
		List<Employee> employee=employeeRepo.findByUserid(id);
		Long empid = null;
		for(Employee employee2:employee) {
			empid=employee2.getEmpid();
			break;
		}
		employeeRepo.deleteById(empid);
	}
	
	@Override
	public Employee updateEmployee(Employee employee, Long id) {
		Long empid = null;
		List<Employee> employeedata=employeeRepo.findByUserid(id);
		for(Employee employee2:employeedata) {
			empid=employee2.getEmpid();
			break;
		}
		final Long empidnew= empid;
		Employee existingEmployee = employeeRepo.findById(empid).orElseThrow(()
				-> new ResourceNotFoundException("Employee","empid",empidnew));
		existingEmployee.setEmail(employee.getEmail());
		existingEmployee.setFirstname(employee.getFirstname());
		existingEmployee.setLastname(employee.getLastname());
		employeeRepo.save(existingEmployee);
		return existingEmployee;
	}
	

	@Override
	public void updateJobSalary(Employee employee, Long id) {
		System.out.println("--------------------12--------------------");
		List<Employee> employeedata=employeeRepo.findByUserid(id);
		Long empid = null;
		for(Employee employee2:employeedata) {
			empid=employee2.getEmpid();
			break;
		}
		System.out.println("--------------------13--------------------");
		Employee existingEmployee = employeeRepo.findById(empid).orElseThrow(()
				-> new ResourceNotFoundException("Employee","id",id));
		if(!(employee.getJob()==null) &&! (employee.getJob()=="")) {
			existingEmployee.setJob(employee.getJob());
			System.out.println("--------------------14--------------------");
		}
		if(!(employee.getSalary()==null)) {
			Long totalsaly=0L;
			if(existingEmployee.getSalary() !=null) {
				totalsaly=existingEmployee.getSalary();
			}
			totalsaly=totalsaly+employee.getSalary();
			
		existingEmployee.setSalary(totalsaly);
		}
		System.out.println("--------------------15--------------------");
		employeeRepo.save(existingEmployee);
		System.out.println("--------------------15.001--------------------");
	}	
			
	
	@Override
	public String jobcheck(Long id) {
		Long empid = null;
		List<Employee> employeedata=employeeRepo.findByUserid(id);
		for(Employee employee2:employeedata) {
			empid=employee2.getEmpid();
			break;
		}
		final Long empidnew= empid;
		Employee existingEmployee = employeeRepo.findById(empid).orElseThrow(
				() -> new ResourceNotFoundException("Employee", "empid", empidnew));
		
		return existingEmployee.getJob();
	}

	
	
}
