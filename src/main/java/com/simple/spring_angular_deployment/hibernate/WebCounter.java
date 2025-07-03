package com.simple.spring_angular_deployment.hibernate;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class WebCounter {
    @Autowired
    private WebCounterRepository wcRepository;

    public WebCounter saveOrUpdate(WebCounter p) {
        wcRepository.save(p);
        return p;
    }
}



