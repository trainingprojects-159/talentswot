package com.mphasis.talentswot.daos;

import java.util.List;

import com.mphasis.talentswot.entities.Skills;
import com.mphasis.talentswot.exceptions.BuissnessException;

public interface SkillsDao {

	public void addSkills(Skills s) throws BuissnessException;
	public void deleteSkills(String skill_id) throws BuissnessException;
	public void updateSkills(Skills skills) throws BuissnessException;
	public Skills getSkillsById(String skill_id) throws BuissnessException;
	public List<Skills> getAllSkills() throws BuissnessException;
}
