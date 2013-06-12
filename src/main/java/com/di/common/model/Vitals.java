package com.di.common.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "vitals")
public class Vitals implements Serializable {
	private Integer id;
	private Visit visit;
	private Double pulse;
	private Integer systolic;
	private Integer diastolic;
	
	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	@ManyToOne
	@JoinColumn(name = "visit_id")
	public Visit getVisit() {
		return visit;
	}
	
	public void setVisit(Visit visit) {
		this.visit = visit;
	}
	
	@Column
	public Double getPulse() {
		return pulse;
	}
	
	public void setPulse(Double pulse) {
		this.pulse = pulse;
	}
	
	@Column(name = "systolic_bp")
	public Integer getSystolic() {
		return systolic;
	}
	
	public void setSystolic(Integer systolic) {
		this.systolic = systolic;
	}
	
	@Column(name = "diastolic_bp")
	public Integer getDiastolic() {
		return diastolic;
	}
	
	public void setDiastolic(Integer diastolic) {
		this.diastolic = diastolic;
	}
	
}
