package com.emp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
		Employee employee1 = new Employee(1L,11L,"sathish","kumar","satz@gmail.com",5000L,"job1");
		Employee employee2 = new Employee(2L,12L,"sathish","kumar","satz@gmail.com",5000L,"job1");
		List<Employee> listofemp = List.of(employee1,employee2);
		when(this.employeeRepo.findAll()).thenReturn(listofemp);
		assertEquals(2,employeeService.getAllEmployees().size());
	}
	
//	@Test 
//	public void getAllCompensationsCreatedByCompUserTest(){ 
//	Compensation compensation1 = new Compensation(1,"partner1","PRO",new Date(2022,01,18),new Date(2022,01,19),"VOLUME",90,1,2); 
//	Compensation compensation2 = new Compensation(2,"partner2","PRO",new Date(2022,01,18),new Date(2022,01,19),"VOLUME",90,2,4); 
//	Compensation compensation3 = new Compensation(3,"partner3","PRO",new Date(2022,01,18),new Date(2022,01,19),"VOLUME",90,3,6); 
//	Compensation compensation4 = new Compensation(4,"partner4","PRO",new Date(2022,01,18),new Date(2022,01,19),"VOLUME",90,4,8); 
//	List<Compensation> allCompensations = List.of(compensation1, compensation2, compensation3, compensation4); 
//	when(this.compensationRepository.findCompensationById(2)).thenReturn(Stream.of(new Compensation(2,"partner2","PRO",new Date(2022,01,18),new Date(2022,01,19),"VOLUME",90,2,4))
//	.collect(Collectors.toList())); 
	//assertEquals(1,compensationRepository.findCompensationById(2).size()); }
	
	@Test
	public void getEmployeeByIdTest() {
		Employee employee1 = new Employee(1L,11L,"sathish","kumar","satz@gmail.com",5000L,"job1");
		
		Optional<Employee> allEmployee = Optional.of(employee1);
		when(this.employeeRepo.findById(1L)).thenReturn(allEmployee);
				
		assertEquals(allEmployee.get(),employeeService.getEmployeesById(1L));
	}
	
}
