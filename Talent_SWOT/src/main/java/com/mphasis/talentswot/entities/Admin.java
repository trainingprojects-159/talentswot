package com.mphasis.talentswot.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Admin {
	
	@Id
	private String a_id;
	private String pass;
	@OneToMany(mappedBy="a_id", fetch= FetchType.LAZY, cascade= CascadeType.ALL)
	private List<Candidate> c_id;
	@OneToMany(mappedBy="a_id", fetch= FetchType.LAZY, cascade= CascadeType.ALL)
	private List<Technical> tech_id;
	@OneToMany(mappedBy="a_id", fetch= FetchType.LAZY, cascade= CascadeType.ALL)
	private List<HR> hr_id;
	@OneToOne
	private FinalStatus s_id;
	
	public FinalStatus getS_id() {
		return s_id;
	}
	public void setS_id(FinalStatus s_id) {
		this.s_id = s_id;
	}
	public String getA_id() {
		return a_id;
	}
	public void setA_id(String a_id) {
		this.a_id = a_id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public List<Candidate> getC_id() {
		return c_id;
	}
	public void setC_id(List<Candidate> c_id) {
		this.c_id = c_id;
	}
	public List<Technical> getTech_id() {
		return tech_id;
	}
	public void setTech_id(List<Technical> tech_id) {
		this.tech_id = tech_id;
	}
	public List<HR> getHr_id() {
		return hr_id;
	}
	public void setHr_id(List<HR> hr_id) {
		this.hr_id = hr_id;
	}
	
	
}
