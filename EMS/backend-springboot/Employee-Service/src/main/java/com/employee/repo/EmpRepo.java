package com.employee.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.entity.Employee;

public interface EmpRepo extends JpaRepository<Employee, Long> {

}
