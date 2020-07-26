package com.service;

public class HealthCheckService {
	
	public String healthcheck(){
		try {
			return "Sukdeal App Api Server is in running!";
		} catch(Exception e) {
			return "Something wen wrong - \n" +e.getStackTrace();
		}
	}

}