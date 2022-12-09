package com.user.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.Entity.User;
import com.user.Repo.IUserRepo;

@Service
public class UserService implements IuserService {
	
	@Autowired
	private IUserRepo userrepo;

	@Override
	public Integer saveUser(User user) {
		User savedUser = userrepo.save(user);
		return savedUser.getUserID();
	}

	

}
