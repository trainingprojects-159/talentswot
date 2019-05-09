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
	@JoinColumn(name="Hr_Int_Id")
	private HRInterview hr_i_id;
	@OneToOne
	@JoinColumn(name="Admin_Id")
	private Admin a_id;
	
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
	public HRInterview getHr_i_id() {
		return hr_i_id;
	}
	public void setHr_i_id(HRInterview hr_i_id) {
		this.hr_i_id = hr_i_id;
	}
	public Admin getA_id() {
		return a_id;
	}
	public void setA_id(Admin a_id) {
		this.a_id = a_id;
	}
	
	
}
