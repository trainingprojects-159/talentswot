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
	private String hrinterviewdate;
	private int rating;
	private String hr_status;
	@OneToOne
	private TechnicalInterview technicalInterview;
	@OneToOne
	private HR hr;
	@OneToMany(mappedBy="hrInterview",fetch= FetchType.LAZY, cascade= CascadeType.ALL)
	private List<Candidate> candidate;
	
	public String getHr_status() {
		return hr_status;
	}
	public void setHr_status(String hr_status) {
		this.hr_status = hr_status;
	}
	
	
	public int getHr_i_id() {
		return hr_i_id;
	}
	public void setHr_i_id(int hr_i_id) {
		this.hr_i_id = hr_i_id;
	}
	
	public String getHrinterviewdate() {
		return hrinterviewdate;
	}
	public void setHrinterviewdate(String hrinterviewdate) {
		this.hrinterviewdate = hrinterviewdate;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public TechnicalInterview getTechnicalInterview() {
		return technicalInterview;
	}
	public void setTechnicalInterview(TechnicalInterview technicalInterview) {
		this.technicalInterview = technicalInterview;
	}
	public HR getHr() {
		return hr;
	}
	public void setHr(HR hr) {
		this.hr = hr;
	}
	public List<Candidate> getCandidate() {
		return candidate;
	}
	public void setCandidate(List<Candidate> candidate) {
		this.candidate = candidate;
	}
	
	
	
	
	
		
}
