package com.user.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.entity.Employee;
import com.user.entity.Jobs;
import com.user.entity.JwtRequest;
import com.user.entity.JwtResponse;
import com.user.entity.User;
import com.user.service.IUserService;
import com.user.service.UserDataService;
import com.user.service.UserService;
import com.user.utility.JWTUtility;

@RestController
public class SecurityController {
	
	@Autowired
	private IUserService iUserService;
	
	@Autowired
	private UserDataService userDataService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private JWTUtility jwtUtility;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping("/signup")
	public ResponseEntity<?> createUser(@RequestBody User user) {
		User usersignup=iUserService.signup(user);
		String url ="http://EmployeeService/Add";
		Employee employeedata= new Employee();
		employeedata.setEmail(usersignup.getEmail());
		employeedata.setFirstname(usersignup.getFirstname());
		employeedata.setLastname(usersignup.getLastname());
		employeedata.setUserid(usersignup.getId());
		Optional employee=this.restTemplate.postForObject(url, employeedata, Optional.class);
		return new ResponseEntity<>(usersignup, HttpStatus.OK);
	}
	
	//@PostMapping("/signup")
	//public ResponseEntity<?> createUser(@RequestBody User user) {
	//	return new ResponseEntity<>(iUserService.signup(user), HttpStatus.OK);
	//}
	
	@PostMapping("/signin")
	public ResponseEntity<?> login(@RequestBody JwtRequest jwtRequest) throws Exception {
		try {
			authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(jwtRequest.getUsername() , jwtRequest.getPassword()));
		} catch (BadCredentialsException e) {
			throw new Exception("INVALID CREDENTIALS", e);
		}
		final UserDetails userDetails = userDataService.loadUserByUsername(jwtRequest.getUsername());
		final String token = jwtUtility.generateToken(userDetails);
		User loggedUser = iUserService.getUserByName(jwtRequest.getUsername());
		return new ResponseEntity<>(new JwtResponse(token,  loggedUser.getUsername() , loggedUser.getRole().toString()),
				HttpStatus.OK);
	}
	
	//delete user
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<User> deleteUser(@PathVariable Long id) {
		System.out.println(id);
		ResponseEntity<User> responseEntity = new ResponseEntity<>(HttpStatus.OK);
		try {
			//String url ="http://EmployeeService/delete/"+id;
			 //this.restTemplate.delete(url);
			userService.deleteUserDetail(id);
			} catch(Exception e) {
				e.printStackTrace();
				responseEntity = new ResponseEntity<User>(HttpStatus.NOT_FOUND);
			}
		return responseEntity;
	}
	
	//update user
	@PutMapping("/update/{id}")
	public ResponseEntity<User> updateUser(@PathVariable("id") Long id, @RequestBody User user) {
		 String url ="http://EmployeeService/update/"+id;
		    Employee employeedata= new Employee();
			employeedata.setEmail(user.getEmail());
			employeedata.setFirstname(user.getFirstname());
			employeedata.setLastname(user.getLastname());
			this.restTemplate.put(url, user);
		return new ResponseEntity<User>(userService.updateUserDetail(user, id), HttpStatus.OK);
	}

	//Registered users
	@GetMapping("/allusers")
	public List<User> getAllLibraryBooks() {
		return userService.getAllUsers();
	}
	
	
	//get all employee details
	@GetMapping("/getallemp")
    public List<Employee> getEmp(){
	  String url ="http://EmployeeService/getall/";
	  return  this.restTemplate.getForObject(url,List.class);
    }
	
	//get employee by id
	@GetMapping("/getemp/{id}")
    public Optional<Employee> getEmployee(@PathVariable Long id){
	  String url ="http://EmployeeService/get/";
			  return this.restTemplate.getForObject(url+id,Optional.class);
    }
	
	//get jobs
	@GetMapping("/availablejobs")
	public List<Jobs> getalljobs() {
		String url = "http://JobsModule/alljobs";
		return this.restTemplate.getForObject(url, List.class);
	}
	
	//create jobs
	@PostMapping("/createjobs")
	public ResponseEntity<?> createJobs(@RequestBody Jobs jobs) {
		String url = "http://JobsModule/add/Jobs";
		Long jobId=this.restTemplate.postForObject(url, jobs, Long.class);
		return new ResponseEntity<>(jobId, HttpStatus.OK);
	}
	
}
