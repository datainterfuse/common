package com.di.common.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "visit")
public class Visit implements Serializable {
	private Integer id;
	private Person person;
	private Timestamp admitDate;
	private Timestamp dischargeDate;
	private String diagnosis;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false)
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	@ManyToOne
	@JoinColumn(name = "person_id")
	public Person getPerson() {
		return person;
	}
	
	public void setPerson(Person person) {
		this.person = person;
	}
	
	@Column(name = "admit_date")
	public Timestamp getAdmitDate() {
		return admitDate;
	}
	
	public void setAdmitDate(Timestamp admitDate) {
		this.admitDate = admitDate;
	}
	
	@Column(name = "discharge_date")
	public Timestamp getDischargeDate() {
		return dischargeDate;
	}
	
	public void setDischargeDate(Timestamp dischargeDate) {
		this.dischargeDate = dischargeDate;
	}
	
	@Column
	public String getDiagnosis() {
		return diagnosis;
	}
	
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	
}
