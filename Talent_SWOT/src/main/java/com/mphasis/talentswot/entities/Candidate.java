package com.mphasis.talentswot.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Candidate {
	
	@Id
	private String c_id;
	private String fname;
	private String lname;
	private String designation;
	private String experience;
	private String location;
	private int nperiod; 
	
	@ManyToMany(mappedBy="candidate",fetch= FetchType.LAZY, cascade= CascadeType.ALL)
	private List<Skills> skill_id;
	

	
	@ManyToOne
	private TechnicalInterview technicalInterview;
	
	@ManyToOne
	private HRInterview hrInterview;

	public String getC_id() {
		return c_id;
	}

	public void setC_id(String c_id) {
		this.c_id = c_id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNperiod() {
		return nperiod;
	}

	public void setNperiod(int nperiod) {
		this.nperiod = nperiod;
	}

	public List<Skills> getSkill_id() {
		return skill_id;
	}

	public void setSkill_id(List<Skills> skill_id) {
		this.skill_id = skill_id;
	}


	public TechnicalInterview getTechnicalInterview() {
		return technicalInterview;
	}

	public void setTechnicalInterview(TechnicalInterview technicalInterview) {
		this.technicalInterview = technicalInterview;
	}

	public HRInterview getHrInterview() {
		return hrInterview;
	}

	public void setHrInterview(HRInterview hrInterview) {
		this.hrInterview = hrInterview;
	}
	
	
	
	
	
}
