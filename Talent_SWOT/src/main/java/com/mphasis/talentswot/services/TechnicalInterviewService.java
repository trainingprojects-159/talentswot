package com.mphasis.talentswot.services;

import java.util.List;

import com.mphasis.talentswot.entities.TechnicalInterview;

public interface TechnicalInterviewService {

	public void scheduleTechnicalInterview(TechnicalInterview t);
	public TechnicalInterview getTechnicalInterviewById(int tech_i_id);
	public List <TechnicalInterview> getAllTechnicalInterview();
}
