package com.mphasis.talentswot.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Skills {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int skill_id;
	private String p_skills;
	private String s_skills;
	@ManyToMany
	private List<Candidate> candidate;
	public int getSkill_id() {
		return skill_id;
	}
	public void setSkill_id(int skill_id) {
		this.skill_id = skill_id;
	}
	public String getP_skills() {
		return p_skills;
	}
	public void setP_skills(String p_skills) {
		this.p_skills = p_skills;
	}
	public String getS_skills() {
		return s_skills;
	}
	public void setS_skills(String s_skills) {
		this.s_skills = s_skills;
	}
	public List<Candidate> getCandidate() {
		return candidate;
	}
	public void setCandidate(List<Candidate> candidate) {
		this.candidate = candidate;
	}
	
	
	

	
	
}
