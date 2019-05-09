package com.mphasis.talentswot.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
	private String status;
	@OneToMany(mappedBy="c_id", fetch= FetchType.LAZY, cascade= CascadeType.ALL)
	private List<Skills> skill_id;
	@ManyToOne
	@JoinColumn(name="Admin_Id")
	private Admin a_id;
	@ManyToOne
	@JoinColumn(name="Tech_Int_Id")
	private TechnicalInterview tech_i_id;
	@ManyToOne
	@JoinColumn(name="Hr_Int_Id")
	private HRInterview hr_i_id;
	
	public TechnicalInterview getTech_i_id() {
		return tech_i_id;
	}
	public void setTech_i_id(TechnicalInterview tech_i_id) {
		this.tech_i_id = tech_i_id;
	}
	public Admin getA_id() {
		return a_id;
	}
	public void setA_id(Admin a_id) {
		this.a_id = a_id;
	}
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
	public HRInterview getHr_i_id() {
		return hr_i_id;
	}
	public void setHr_i_id(HRInterview hr_i_id) {
		this.hr_i_id = hr_i_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
