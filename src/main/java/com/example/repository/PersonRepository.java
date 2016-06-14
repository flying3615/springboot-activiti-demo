package com.example.repository;

import com.example.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by centling on 2016/6/14.
 */
public interface PersonRepository extends JpaRepository<Person, Long> {

    Person findByUsername(String username);

}