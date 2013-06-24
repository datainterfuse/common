package com.di.common.controller.impl;

import java.util.List;
import org.springframework.stereotype.Component;
import com.di.common.controller.PersonController;
import com.di.common.model.Person;
import com.di.common.util.CustomHibernateDaoSupport;

@Component
public class PersonControllerImpl extends CustomHibernateDaoSupport implements PersonController {
	
	public List<Person> getAll() {
		return (List<Person>) getHibernateTemplate().find("from Person");
		//return (List<Person>) sessionFactory.getCurrentSession().createQuery("from Person").list();
	}

	public void save(Person person) {
		//sessionFactory.getCurrentSession().save(person);
	}

	public void update(Person person) {
		//sessionFactory.getCurrentSession().update(person);
	}

	public void delete(Person person) {
		//sessionFactory.getCurrentSession().delete(person);
	}

}
