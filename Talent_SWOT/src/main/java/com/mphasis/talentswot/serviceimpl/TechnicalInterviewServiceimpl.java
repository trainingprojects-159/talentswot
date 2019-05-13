package com.mphasis.talentswot.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.talentswot.daos.TechnicalInterviewDao;
import com.mphasis.talentswot.entities.TechnicalInterview;
import com.mphasis.talentswot.exceptions.BuissnessException;
import com.mphasis.talentswot.services.TechnicalInterviewService;

@Service
public class TechnicalInterviewServiceimpl implements TechnicalInterviewService {

	@Autowired
	TechnicalInterviewDao technicalInterviewDao;
	
	public void setTechnicalInterviewDao(TechnicalInterviewDao technicalInterviewDao) {
		this.technicalInterviewDao = technicalInterviewDao;
	}

	public void scheduleTechnicalInterview(TechnicalInterview t) throws BuissnessException {
		technicalInterviewDao.scheduleTechnicalInterview(t);
	}

	public TechnicalInterview getTechnicalInterviewById(int tech_i_id)  throws BuissnessException{
		return technicalInterviewDao.getTechnicalInterviewById(tech_i_id);
	}

	public List<TechnicalInterview> getAllTechnicalInterview() throws BuissnessException {
		return technicalInterviewDao.getAllTechnicalInterview();
	}

	@Override
	public void updateTechnicalinterview(TechnicalInterview technicalInterview) throws BuissnessException {
		technicalInterviewDao.updateTechnicalinterview(technicalInterview);
	}

	@Override
	public List<TechnicalInterview> getTechnicalInterviewByStatus(String tech_status) throws BuissnessException {
		return technicalInterviewDao.getTechnicalInterviewByStatus(tech_status);
	}

}
