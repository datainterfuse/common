package com.di.common.controller;

import java.util.List;

import com.di.common.model.Visit;

public interface VisitController {
	List<Visit> getAll();
	void save(Visit visit);
	void update(Visit visit);
	void delete(Visit visit);
}
