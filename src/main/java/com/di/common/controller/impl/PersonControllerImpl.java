package com.di.common.controller.impl;

import java.util.List;

import com.di.common.controller.PersonController;
import com.di.common.model.Person;
import com.di.common.util.CustomHibernateDaoSupport;

public class PersonControllerImpl extends CustomHibernateDaoSupport implements PersonController {

	public List<Person> getAll() {
		return (List<Person>) getHibernateTemplate().find("from Person");
	}

	public void save(Person person) {
		getHibernateTemplate().save(person);
	}

	public void update(Person person) {
		getHibernateTemplate().update(person);
	}

	public void delete(Person person) {
		getHibernateTemplate().delete(person);
	}

}
