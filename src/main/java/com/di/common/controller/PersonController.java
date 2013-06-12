package com.di.common.controller;

import java.util.List;

import com.di.common.model.Person;

public interface PersonController {
	
	List<Person> getAll();
	void save(Person person);
	void update(Person person);
	void delete(Person person);

}
