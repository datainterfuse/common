package com.di.common.controller;

import java.util.List;
import com.di.common.model.Vitals;

public interface VitalsController {
	
	List<Vitals> getAll();
	void save(Vitals vitals);
	void update(Vitals vitals);
	void delete(Vitals vitals);

}
