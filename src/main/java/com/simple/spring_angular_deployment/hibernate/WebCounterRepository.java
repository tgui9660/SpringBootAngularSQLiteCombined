package com.simple.spring_angular_deployment.hibernate;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface WebCounterRepository extends CrudRepository<WebCounter, Integer> {

}
