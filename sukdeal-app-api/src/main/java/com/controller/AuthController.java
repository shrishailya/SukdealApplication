package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.User;
import com.model.AuthResponse;
import com.service.AuthService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
	@Value("${spring.profiles.active}") String profile;
	
	@GetMapping("/user/{role}/{userName}/{emailId}")
	public User createUser(@PathVariable String role, @PathVariable String userName, @PathVariable String emailDd) throws Exception {
		AuthService authService = new AuthService();
		return authService.createUser(userName, role, emailDd);
	}
	
	@PostMapping("/signon")
	public AuthResponse signin(@RequestBody String userName) {
		AuthService authService = new AuthService();
		AuthResponse response = authService.getAuthResponse(userName);
		return response;
	}

}