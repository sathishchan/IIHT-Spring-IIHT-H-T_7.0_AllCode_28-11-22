package com.user.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.Entity.JwtRequest;
import com.user.Entity.JwtResponse;
import com.user.Entity.User;
import com.user.Service.IuserService;
import com.user.Service.UserService;
import com.user.utility.JWTUtility;

@RestController
@CrossOrigin("http://localhost:4200/")
public class SecurityController {
	
	@Autowired
	private IuserService iuserService;
	
	@Autowired 
	private UserService userService;
	
	@Autowired
	private JWTUtility jwtUtility;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	
	@PostMapping("/signup")
	public ResponseEntity<?> createUser(@RequestBody User user) {
		return new ResponseEntity<>(iuserService.signup(user), HttpStatus.OK);
	}
	
	@PostMapping("/signin")
	public ResponseEntity<?> login(@RequestBody JwtRequest jwtRequest) throws Exception {
		try {
			authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(jwtRequest.getUsername(), jwtRequest.getPassword()));
		} catch (BadCredentialsException e) {
			throw new Exception("INVALID CREDENTIALS", e);
		}
		final UserDetails userDetails = userService.loadUserByUsername(jwtRequest.getUsername());
		final String token = jwtUtility.generateToken(userDetails);
		User loggedUser = iuserService.getUserByName(jwtRequest.getUsername());
		return new ResponseEntity<>(new JwtResponse(token, loggedUser.getUsername(), loggedUser.getRole().toString()),
				HttpStatus.OK);
	}

}






/**@PostMapping("/signup")
Long createUser(@RequestBody User user) {
	Long id = iuserService.saveuser(user);
	System.out.println(id);
	return id;
}**/
