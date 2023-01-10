package com.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.user.entity.User;
import com.user.exception.ResourceNotFoundExceptionHandler;
import com.user.repo.IUserRepo;

@Service
public class UserService implements IUserService {
	
	@Autowired
	private IUserRepo iUserRepo;
	
	@Autowired
	private PasswordEncoder encoder;
	

	@Override
	public User getUserByName(String username) {
		return iUserRepo.findByUsername(username);
	}

	@Override
	public User signup(User newUser) {
		newUser.setPassword(encoder.encode(newUser.getPassword()));
		return iUserRepo.save(newUser);
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
		existingUser.setRole(user.getRole());
		
		iUserRepo.save(existingUser);
		return existingUser;
	}

}
