package com.mphasis.talentswot.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class HR {

	@Id
	private String hr_id;
	private String pass;
	private String status;
	@ManyToOne
	private Admin a_id; 
	@OneToOne
	private HRInterview hr_i_id;
	public String getHr_id() {
		return hr_id;
	}
	public void setHr_id(String hr_id) {
		this.hr_id = hr_id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public Admin getA_id() {
		return a_id;
	}
	public void setA_id(Admin a_id) {
		this.a_id = a_id;
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

