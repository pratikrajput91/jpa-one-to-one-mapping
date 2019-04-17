package com.example.oneToOne.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.oneToOne.person.Person;

public interface PersonDao  extends JpaRepository<Person, Integer>{

}
