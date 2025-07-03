package com.simple.spring_angular_deployment.hibernate;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WebCounterService {

    @Autowired
    private WebCounterRepository wcrRepository;

    public WebCounter saveOrUpdate(WebCounter p) {
        wcrRepository.save(p);
        return p;
    }
}
