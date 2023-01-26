package com.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;
import org.springframework.web.client.RestTemplate;

import com.user.entity.Employee;
import com.user.entity.Jobs;
import com.user.entity.User;
import com.user.exception.ResourceNotFoundExceptionHandler;
import com.user.repo.IUserRepo;

@Service
public class UserService implements IUserService {
	
	@Autowired
	private IUserRepo iUserRepo;
	
	@Autowired
	private PasswordEncoder encoder;
	
	@Autowired
	private RestTemplate restTemplate;
	

	@Override
	public User getUserByName(String username) {
		return iUserRepo.findByUsername(username);
	}

	@Override
	public User signup(User newUser) {
		newUser.setPassword(encoder.encode(newUser.getPassword()));
		//User result = restTemplate.postForObject("http://EmployeeService/employee", newUser, User.class);
		return iUserRepo.save(newUser);
	}
	
	public Optional<User> getuserbyid(Long id) {
		return iUserRepo.findById(id);
	}

	//delete user
	@Override
	public void deleteUserDetail(Long id) {
		iUserRepo.deleteById(id);
		
	}

	//update user
	@Override
	public User updateUserDetail(User user, Long id) {
		User existingUser = iUserRepo.findById(id).orElseThrow(
				() -> new ResourceNotFoundExceptionHandler("User", "id", id));
		
		existingUser.setFirstname(user.getFirstname());
		existingUser.setLastname(user.getLastname());
		existingUser.setEmail(user.getEmail());
		existingUser.setUsername(user.getUsername());
		existingUser.setPassword(user.getPassword());
		//existingUser.setRole(user.getRole());
		
		iUserRepo.save(existingUser);
		return existingUser;
	}

	@Override
	public List<User> getAllUsers() {
		return iUserRepo.findAll();
	}

	@Override
	public Boolean updateJobAndSalary(Jobs jobs, Long userid) {
		System.out.println("---------------------------1---------------------------");
		User existingUser = iUserRepo.findById(userid).orElseThrow(
				() -> new ResourceNotFoundExceptionHandler("User", "userid", userid));
		String rolename=existingUser.getRole().toString();
	
		
		System.out.println("---------------------------2---------------------------");
		if(rolename.equals(jobs.getApplicablerole())) {
			System.out.println("---------------------------3---------------------------");
			if(jobs.getStatus().equals("inprogress")) {
				String url = "http://EmployeeService/jobcheck/"+userid;
				String currentJob=restTemplate.getForObject(url, String.class); 
				System.out.println("---------------------------4---------------------------");
				if(currentJob!=null) {
					String urljob = "http://JobsModule/jobtimecheck/"+currentJob+"/"+jobs.getJobname();
					Boolean jobaccess= restTemplate.getForObject(urljob, Boolean.class);
					
					if(jobaccess) {
						return false;
					}
				}
				System.out.println("---------------------------5---------------------------");
				
					String url1 = "http://EmployeeService/updateJobSalary/"+userid;
					Employee employeedata = new Employee();
					employeedata.setJob(jobs.getJobname());
					employeedata.setJobid(jobs.getId());
					restTemplate.put(url1, employeedata);
					System.out.println("---------------------------5.0---------------------------");
				}
			
			
			 if(jobs.getStatus().equals("completed")) {
				String url1 = "http://EmployeeService/updateJobSalary/"+userid;
				Employee employeedata = new Employee();
				employeedata.setSalary(jobs.getProfitvalue());
				restTemplate.put(url1, employeedata);
			}
			
			else if(jobs.getStatus().equals("aborted")) {
				String url1 = "http://EmployeeService/updateJobSalary/"+userid;
				Employee employeedata = new Employee();
				employeedata.setJob(null);
				employeedata.setJobid(null);
				restTemplate.put(url1, employeedata);
			}
			System.out.println("---------------------------5.1---------------------------");
			String urljob = "http://JobsModule/updatejobtimestatus";
			restTemplate.put(urljob, jobs);
		}
		else
		{
			System.out.println("---------------------------6---------------------------");
			return false;
		}
		
		System.out.println("---------------------------7---------------------------");
			return true;
			
	}

}
