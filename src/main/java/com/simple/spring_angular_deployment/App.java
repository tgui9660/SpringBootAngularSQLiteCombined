package com.simple.spring_angular_deployment;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);

		UserService us = new UserService();

		User eric = new	User("Eric", "Morgan");

		us.createUser(eric);
	}

	// @Repository
	// public interface UserRepository extends CrudRepository<User, Long> {
	// }

	public interface UserRepository extends JpaRepository<User, Long> {
	}

	// @Bean
	// public CommandLineRunner run(UserRepository userRepository) throws Exception {
	// 	return (String[] args) -> {
	// 		User user1 = new User("John", "john@domain.com");
	// 		User user2 = new User("Julie", "julie@domain.com");
	// 		userRepository.save(user1);
	// 		userRepository.save(user2);
	// 		userRepository.findAll().forEach(user -> System.out.println(user));
	// 	};
	// }

}
