package com.mphasis.talentswot.daos;

import java.util.List;

import com.mphasis.talentswot.entities.TechnicalInterview;
import com.mphasis.talentswot.exceptions.BuissnessException;

public interface TechnicalInterviewDao {
	
	public void scheduleTechnicalInterview(TechnicalInterview t) throws BuissnessException;
	public void updateTechnicalinterview(TechnicalInterview technicalInterview) throws BuissnessException;
	public TechnicalInterview getTechnicalInterviewById(int tech_i_id) throws BuissnessException;
	public List <TechnicalInterview> getAllTechnicalInterview() throws BuissnessException;
	public List<TechnicalInterview> getTechnicalInterviewByStatus(String tech_status) throws BuissnessException;
	
}
