package com.mphasis.talentswot.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Technical {

	@Id
	private String tech_id;
	private String pass;
	private String status;
	@ManyToOne
	private Admin a_id; 
	@OneToOne
	private TechnicalInterview tech_i_id;
	
	public String getTech_id() {
		return tech_id;
	}
	public void setTech_id(String tech_id) {
		this.tech_id = tech_id;
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
	public TechnicalInterview getTech_i_id() {
		return tech_i_id;
	}
	public void setTech_i_id(TechnicalInterview tech_i_id) {
		this.tech_i_id = tech_i_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
