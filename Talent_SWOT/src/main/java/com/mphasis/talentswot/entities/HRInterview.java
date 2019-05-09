package com.mphasis.talentswot.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class HRInterview {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int hr_i_id; 
	private String date;
	private int rating;
	private String hr_status;
	public String getHr_status() {
		return hr_status;
	}
	public void setHr_status(String hr_status) {
		this.hr_status = hr_status;
	}
	@OneToOne
	@JoinColumn(name="Tech_Int_Id")
	private TechnicalInterview tech_i_id;
	@OneToOne
	@JoinColumn(name="Hr_Id")
	private HR hr_id;
	@OneToOne
	@JoinColumn(name="Status_Id")
	private FinalStatus s_id;
	@OneToMany(mappedBy="hr_i_id", fetch= FetchType.LAZY, cascade= CascadeType.ALL)
	private List<Candidate> c_id;
	
	public int getHr_i_id() {
		return hr_i_id;
	}
	public void setHr_i_id(int hr_i_id) {
		this.hr_i_id = hr_i_id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public TechnicalInterview getTech_i_id() {
		return tech_i_id;
	}
	public void setTech_i_id(TechnicalInterview tech_i_id) {
		this.tech_i_id = tech_i_id;
	}
	public HR getHr_id() {
		return hr_id;
	}
	public void setHr_id(HR hr_id) {
		this.hr_id = hr_id;
	}
	public FinalStatus getS_id() {
		return s_id;
	}
	public void setS_id(FinalStatus s_id) {
		this.s_id = s_id;
	}
	public List<Candidate> getC_id() {
		return c_id;
	}
	public void setC_id(List<Candidate> c_id) {
		this.c_id = c_id;
	}
	
	
		
}
