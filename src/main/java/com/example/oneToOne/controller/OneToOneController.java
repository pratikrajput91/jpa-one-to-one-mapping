package com.example.oneToOne.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.oneToOne.dao.PersonDao;
import com.example.oneToOne.person.Person;
import com.example.oneToOne.person.Profile;




@RestController
public class OneToOneController {
	@Autowired
	private PersonDao dao;
	
	@RequestMapping("/")
	public void toSend() {
		//Person person=new Person(101,"pratik",new Profile(301,"java"));
		Person person=new Person(101,"pratik",new Profile(301,"java"));
		dao.save(person);
		
		
	}
	@RequestMapping("/new")
	public Person toDisplay() {
		Person person=dao.findById(101).get();
		return person;
	}
	

}
