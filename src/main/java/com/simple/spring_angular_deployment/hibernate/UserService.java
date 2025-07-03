package com.simple.spring_angular_deployment.hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveOrUpdate(User p) {
        userRepository.save(p);
        return p;
    }
}