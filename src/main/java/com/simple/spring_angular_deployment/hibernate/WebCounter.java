package com.simple.spring_angular_deployment.hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "webcounter")
public class WebCounter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer count;

    public WebCounter(){
        
    }

    public WebCounter(Integer count) {
        this.count = count;
    }

    // Getters and Setters
    public void increment() {
        this.count = this.count + 1;
    }

    public Integer GetCount(){
        return this.count;
    }
}
