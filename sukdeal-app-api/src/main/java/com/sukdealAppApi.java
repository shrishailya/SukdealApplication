package com;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class sukdealAppApi implements CommandLineRunner
{
	public static void main(String[] args) 
	{
		SpringApplication.run(sukdealAppApi.class, args);   
	}
 
	public void run(String... arg0) throws Exception {
 
		System.out.println("Welcome to sukdeal-app-api");
	}
}
