package com.simple.spring_angular_deployment.hibernate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// @Repository
// public interface UserRepository extends JpaRepository<User, Long> {}


@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}