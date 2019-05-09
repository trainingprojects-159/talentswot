package com.mphasis.talentswot.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Skills {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int skill_id;
	private String p_skills;
	private String s_skills;
	@ManyToOne
	@JoinColumn(name="Candidate_Id")
	private Candidate c_id;
	
	
	public Candidate getC_id() {
		return c_id;
	}
	public void setC_id(Candidate c_id) {
		this.c_id = c_id;
	}
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
	
	
}
