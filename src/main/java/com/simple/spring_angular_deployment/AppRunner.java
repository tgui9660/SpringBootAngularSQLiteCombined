package com.simple.spring_angular_deployment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {
	
	@Autowired
	UserService userService;

	@Override
	public void run(String... args) throws Exception {
		
		User user = new User("Eric","Morgan");
		// user.setFirstName("Raj1");
		// user.setLastName("Kishore2");
		
		userService.createUser(user);
		
		// List<User> users = userService.getAllUsers();
		// users.forEach((u) -> System.out.println(u.getFirstName()+ " " + u.getLastName()));
		
	}

}