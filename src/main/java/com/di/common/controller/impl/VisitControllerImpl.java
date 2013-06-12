package com.di.common.controller.impl;

import java.util.List;

import com.di.common.controller.VisitController;
import com.di.common.model.Visit;
import com.di.common.util.CustomHibernateDaoSupport;

public class VisitControllerImpl extends CustomHibernateDaoSupport implements
		VisitController {

	public List<Visit> getAll() {
		return (List<Visit>) getHibernateTemplate().find("from Visit");
	}

	public void save(Visit visit) {
		getHibernateTemplate().save(visit);

	}

	public void update(Visit visit) {
		getHibernateTemplate().update(visit);

	}

	public void delete(Visit visit) {
		getHibernateTemplate().delete(visit);

	}

}
