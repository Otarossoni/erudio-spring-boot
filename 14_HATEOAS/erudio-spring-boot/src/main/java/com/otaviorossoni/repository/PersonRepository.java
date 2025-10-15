package com.otaviorossoni.repository;

import com.otaviorossoni.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {}
