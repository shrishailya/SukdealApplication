package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.HealthCheckService;

@RestController
@RequestMapping("/api/healthcheck")
public class HealthCheckController {

	@GetMapping("")
	public String ping() throws Exception {
		HealthCheckService health = new HealthCheckService();
		return health.healthcheck();
	}
	
}

