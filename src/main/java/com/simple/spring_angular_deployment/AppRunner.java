package com.simple.spring_angular_deployment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.simple.spring_angular_deployment.resources.hibernate.User;
import com.simple.spring_angular_deployment.resources.hibernate.UserService;

@Component
public class AppRunner implements CommandLineRunner {
	
	@Autowired
	UserService userService;

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("AppRunner Executing !!!!!!!!!!!!!!!!!!!!!!!");

		User user = new User("John2","D'oh!");

		userService.saveOrUpdate(user);

		
	}

}