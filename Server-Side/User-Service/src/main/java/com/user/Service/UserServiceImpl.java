package com.user.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.user.Entity.User;
import com.user.Repo.IUserRepo;

@Service
public class UserServiceImpl implements IuserService {
	
	@Autowired
	private IUserRepo iUserRepo;

	
	@Autowired
	private PasswordEncoder encoder;
	


	@Override
	public User getUserByName(String username) {
		return iUserRepo.findByUsername(username) ;
	}



	@Override
	public User signup(User newUser) {
		newUser.setPassword(encoder.encode(newUser.getPassword()));
		return iUserRepo.save(newUser);
	}

	
}
	
	
	
	
	
	
	
/**	
@Override
public Long saveuser(User user) {
	User savedUser = userRepo.save(user);
	return savedUser.getId();
}
**/	

	
	
	


