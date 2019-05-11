package com.mphasis.talentswot.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Technical {

	@Override
	public String toString() {
		return "Technical [tech_id=" + tech_id + ", pass=" + pass + ", status=" + status + ", admin=" + admin
				+ "]";
	}
	@Id
	private String tech_id;
	private String pass;
	private String status;
	@ManyToOne
	private Admin admin; 
	
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
}
