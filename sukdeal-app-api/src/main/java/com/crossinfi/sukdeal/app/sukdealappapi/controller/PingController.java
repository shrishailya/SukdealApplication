package com.crossinfi.sukdeal.app.sukdealappapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crossinfi.sukdeal.app.sukdealappapi.service.PingService;

@RestController
@RequestMapping("/api/ping")
public class PingController {
	@Value("${spring.profiles.active}") String profile;
	
	
	@GetMapping("")
	public String ping() throws Exception {
		PingService pingService = new PingService();
		return pingService.ping();
	}


}
