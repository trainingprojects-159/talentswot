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
public class TechnicalInterview {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int tech_i_id;
	private String date;
	private String comment;
	private String tech_status;
	private int rating;
	@OneToOne
	@JoinColumn(name="tech_Id")
	private Technical tech_id;
	@OneToMany(mappedBy="tech_i_id", fetch= FetchType.LAZY, cascade= CascadeType.ALL)
	private List<Candidate> c_id;
	@OneToOne
	@JoinColumn(name="Hr_Int_Id")
	private HRInterview hr_i_id;
	
	
	public int getTech_i_id() {
		return tech_i_id;
	}
	public void setTech_i_id(int tech_i_id) {
		this.tech_i_id = tech_i_id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getTech_status() {
		return tech_status;
	}
	public void setTech_status(String tech_status) {
		this.tech_status = tech_status;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Technical getTech_id() {
		return tech_id;
	}
	public void setTech_id(Technical tech_id) {
		this.tech_id = tech_id;
	}
	public List<Candidate> getC_id() {
		return c_id;
	}
	public void setC_id(List<Candidate> c_id) {
		this.c_id = c_id;
	}
	public HRInterview getHr_i_id() {
		return hr_i_id;
	}
	public void setHr_i_id(HRInterview hr_i_id) {
		this.hr_i_id = hr_i_id;
	}
	
	
}
