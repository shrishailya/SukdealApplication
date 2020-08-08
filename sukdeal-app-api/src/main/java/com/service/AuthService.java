package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.entity.User;
import com.model.AuthResponse;
import com.repository.UserRepository;
import com.constant.UserRole;

public class AuthService {
	@Autowired UserRepository userRepository;
	
	public User createUser(String userName, String role, String emailId) {
		return userRepository.insert(new User(userName, UserRole.role(role), emailId));
	}
	
	public AuthResponse getAuthResponse(String userName) {
		Optional<User> user = userRepository.findByUsernameIgnoreCase(userName);
		if(user.isPresent()) {
			return new AuthResponse(userName, user.get().getRole().name());
		}
		return new AuthResponse(userName, UserRole.MEMBER.name());
	}
	
}
