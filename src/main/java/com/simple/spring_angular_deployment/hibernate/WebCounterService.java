package com.simple.spring_angular_deployment.hibernate;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WebCounterService {

    @Autowired
    private WebCounterRepository wcrRepository;

    // public WebCounter saveOrUpdate(WebCounter p) {
    // wcrRepository.save(p);
    // return p;
    // }

    public WebCounter increment() {
        try {
            Optional<WebCounter> found = wcrRepository.findById(1);

            if (found.isEmpty()) {
                WebCounter newCounter = new WebCounter(1);
                wcrRepository.save(newCounter);

                return newCounter;
            } else {
                WebCounter gotEm = found.get();
                gotEm.increment();
                wcrRepository.save(gotEm);

                return gotEm;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;
    }
}
