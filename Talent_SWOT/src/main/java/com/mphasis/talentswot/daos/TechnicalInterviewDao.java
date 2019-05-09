package com.mphasis.talentswot.daos;

import java.util.List;

import com.mphasis.talentswot.entities.TechnicalInterview;

public interface TechnicalInterviewDao {
	
	public void scheduleTechnicalInterview(TechnicalInterview t);
	public TechnicalInterview getTechnicalInterviewById(int tech_i_id);
	public List <TechnicalInterview> getAllTechnicalInterview();
	
}
