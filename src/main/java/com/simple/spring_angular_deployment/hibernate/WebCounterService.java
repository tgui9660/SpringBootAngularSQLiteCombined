package com.simple.spring_angular_deployment.hibernate;


import java.util.Optional;

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

    public WebCounter increment(){
        long amount = wcrRepository.count();

        WebCounter toReturn = new WebCounter(1);

        if (amount == 0) {
            wcrRepository.save(toReturn);
        }else{
            Optional<WebCounter> found = wcrRepository.findById(1);
            
        }

        return toReturn;
    }
}
