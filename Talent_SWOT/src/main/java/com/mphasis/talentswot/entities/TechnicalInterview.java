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
	private String tinterviewdate;
	private String comments;
	private String tech_status;
	private int rating;
	@OneToOne
	private Technical tech_id;
	@OneToMany(mappedBy="technicalInterview",fetch= FetchType.LAZY, cascade= CascadeType.ALL)
	private List<Candidate> candidate;
	public int getTech_i_id() {
		return tech_i_id;
	}
	public void setTech_i_id(int tech_i_id) {
		this.tech_i_id = tech_i_id;
	}
	
	public String getTinterviewdate() {
		return tinterviewdate;
	}
	public void setTinterviewdate(String tinterviewdate) {
		this.tinterviewdate = tinterviewdate;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comment) {
		this.comments = comment;
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
	public List<Candidate> getCandidate() {
		return candidate;
	}
	public void setCandidate(List<Candidate> candidate) {
		this.candidate = candidate;
	}
	@Override
	public String toString() {
		return "TechnicalInterview [tech_i_id=" + tech_i_id + ", date=" + tinterviewdate + ", comment=" + comments
				+ ", tech_status=" + tech_status + ", rating=" + rating + ", tech_id=" + tech_id + ", candidate="
				+ candidate + "]";
	}
	
	
	
	
	
	
	
	
}
