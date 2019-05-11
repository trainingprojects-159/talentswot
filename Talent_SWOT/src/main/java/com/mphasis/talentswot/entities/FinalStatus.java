package com.mphasis.talentswot.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class FinalStatus {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int s_id;
	private String Status;
	@OneToOne
	private HRInterview hrInterview;
	@OneToOne
	private Admin admin;
	
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public HRInterview getHrInterview() {
		return hrInterview;
	}
	public void setHrInterview(HRInterview hrInterview) {
		this.hrInterview = hrInterview;
	}
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	
	
	
	
}
