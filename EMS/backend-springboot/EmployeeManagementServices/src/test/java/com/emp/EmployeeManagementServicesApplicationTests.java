package com.emp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Optional;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.emp.Entity.Employee;
import com.emp.Repo.IEmployeeRepo;
import com.emp.Service.IEmployeeService;





@SpringBootTest
class EmployeeManagementServicesApplicationTests {
	
	@Autowired
	private IEmployeeService employeeService;
	
	@MockBean
	private IEmployeeRepo employeeRepo; 

	@Test
	void contextLoads() {
	}
	
	
	@Test
	public void getAllEmployees() {
		Employee employee1 = new Employee(1L,11L,"sathish","kumar","satz@gmail.com",5000L,"job1",14L);
		Employee employee2 = new Employee(2L,12L,"sathish","kumar","satz@gmail.com",5000L,"job1",15L);
		List<Employee> listofemp = List.of(employee1,employee2);
		when(this.employeeRepo.findAll()).thenReturn(listofemp);
		assertEquals(2,employeeService.getAllEmployees().size());
	}
	
	@Test
	public void getEmployeeByIdTest() {
		Employee employee1 = new Employee(1L,11L,"sathish","kumar","satz@gmail.com",5000L,"job1",14L);
		Optional<Employee> allEmployee = Optional.of(employee1);
		when(this.employeeRepo.findById(1L)).thenReturn(allEmployee);
		assertNotEquals(allEmployee.get(),employeeService.getEmployeesById(2L));
	}

	
}
	






















	

