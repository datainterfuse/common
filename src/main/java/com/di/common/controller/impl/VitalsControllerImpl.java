package com.di.common.controller.impl;

import java.util.List;

import com.di.common.controller.VitalsController;
import com.di.common.model.Vitals;
import com.di.common.util.CustomHibernateDaoSupport;

public class VitalsControllerImpl extends CustomHibernateDaoSupport implements
		VitalsController {

	public List<Vitals> getAll() {
		return (List<Vitals>) getHibernateTemplate().find("from Vitals");
	}

	public void save(Vitals vitals) {
		getHibernateTemplate().save(vitals);

	}

	public void update(Vitals vitals) {
		getHibernateTemplate().update(vitals);

	}

	public void delete(Vitals vitals) {
		getHibernateTemplate().delete(vitals);

	}

}
