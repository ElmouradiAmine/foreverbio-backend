package com.itwins.foreverbio.services;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.itwins.foreverbio.models.User;
import com.itwins.foreverbio.repository.UserRepository;

@Service
@Transactional
public class UserService {
	
	private final UserRepository userRepository;
	
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public void saveUser(User user) {
		userRepository.save(user);
	}

}
