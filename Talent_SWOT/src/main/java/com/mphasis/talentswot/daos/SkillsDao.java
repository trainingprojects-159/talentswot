package com.mphasis.talentswot.daos;

import java.util.List;

import com.mphasis.talentswot.entities.Skills;

public interface SkillsDao {

	public void addSkills(Skills s);
	public void deleteSkills(String skill_id);
	public void updateSkills(Skills skills);
	public Skills getSkillsById(String skill_id);
	public List<Skills> getAllSkills();
}
