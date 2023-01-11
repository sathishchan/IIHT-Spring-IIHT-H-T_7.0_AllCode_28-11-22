package com.emp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EmployeeManagementServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementServicesApplication.class, args);
	}


}
