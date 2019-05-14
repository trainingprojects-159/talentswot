package com.mphasis.talentswot.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Admin {
	
	@Id
	private String a_id;
	private String pass;
	
	@OneToMany(mappedBy="admin",fetch= FetchType.LAZY, cascade= CascadeType.ALL)
	private List<Technical> technical;
	
	@OneToMany(mappedBy="admin",fetch= FetchType.LAZY, cascade= CascadeType.ALL)
	private List<HR> hr;
	
	@OneToMany(mappedBy="admin",fetch= FetchType.LAZY, cascade= CascadeType.ALL)
	private List<Candidate> candidates;
	
	
	public void setCandidates(List<Candidate> candidates) {
		this.candidates = candidates;
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
	public List<Technical> getTechnical() {
		return technical;
	}
	public void setTechnical(List<Technical> technical) {
		this.technical = technical;
	}
	public List<HR> getHr() {
		return hr;
	}
	public void setHr(List<HR> hr) {
		this.hr = hr;
	}
	@Override
	public String toString() {
		return "Admin [a_id=" + a_id + ", pass=" + pass + ", technical=" + technical + ", hr=" + hr + ", getA_id()="
				+ getA_id() + ", getPass()=" + getPass() + ", getTechnical()=" + getTechnical() + ", getHr()=" + getHr()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	
	
	
	
	
	
}
