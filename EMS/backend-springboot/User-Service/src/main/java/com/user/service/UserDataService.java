package com.user.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDataService implements UserDetailsService {
	
	@Autowired
	private IUserService iUserService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		com.user.entity.User user = iUserService.getUserByName(username);
		if(user == null) {
			throw new UsernameNotFoundException("Entered username not found");
		}
		
		return new User(user.getUsername() , user.getPassword() , new ArrayList<>());
	}

}
