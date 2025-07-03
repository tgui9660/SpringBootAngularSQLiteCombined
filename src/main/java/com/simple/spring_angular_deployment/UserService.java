package com.simple.spring_angular_deployment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simple.spring_angular_deployment.App.UserRepository;

@Service
public class UserService {

   @Autowired
   private UserRepository userRepository;

   public User createUser(User user) {
       return userRepository.save(user);
   }
}