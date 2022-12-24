package com.user.Service;

import com.user.Entity.User;

public interface IuserService {
	
	
	public User signup(User newUser);
	
	
    public User getUserByName(String username);

	
	
	
}






//Long saveuser(User user);