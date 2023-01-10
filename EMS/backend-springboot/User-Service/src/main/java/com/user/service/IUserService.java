package com.user.service;

import com.user.entity.User;

public interface IUserService {
	
	//signin
	public User getUserByName(String username);
	
	//Register user
	public User signup(User newUser);
	
	//delete user
	public void deleteUserDetail(Long id);
	
	//update user
	User updateUserDetail(User user, Long id);
	
	

}
