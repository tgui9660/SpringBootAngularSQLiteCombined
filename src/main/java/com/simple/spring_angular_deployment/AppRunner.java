package com.simple.spring_angular_deployment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.simple.spring_angular_deployment.hibernate.User;
import com.simple.spring_angular_deployment.hibernate.UserService;
import com.simple.spring_angular_deployment.hibernate.WebCounterService;


@Component
public class AppRunner implements CommandLineRunner {
	
	@Autowired
	UserService userService;
	
	@Autowired
	WebCounterService wcService;

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("AppRunner Executing !!!!!!!!!!!!!!!!!!!!!!!");

		User user = new User("John3","D'oh!");
		//userService.saveOrUpdate(user);
		

		// wcService.increment();

	}

}