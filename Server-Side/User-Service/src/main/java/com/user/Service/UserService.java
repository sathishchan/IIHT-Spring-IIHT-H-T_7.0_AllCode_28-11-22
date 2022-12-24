package com.user.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class UserService implements UserDetailsService {
	
	@Autowired
	private IuserService iuserService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		com.user.Entity.User user = iuserService.getUserByName(username);
		if(user == null) {
			throw new UsernameNotFoundException("Entered username not found");
		}
		
		return new User(user.getUsername(), user.getPassword(), new ArrayList<>());
	}

}
