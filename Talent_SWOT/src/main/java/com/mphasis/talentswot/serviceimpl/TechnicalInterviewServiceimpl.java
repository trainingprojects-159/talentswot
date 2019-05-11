package com.mphasis.talentswot.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.talentswot.daos.TechnicalInterviewDao;
import com.mphasis.talentswot.entities.TechnicalInterview;
import com.mphasis.talentswot.services.TechnicalInterviewService;

@Service
public class TechnicalInterviewServiceimpl implements TechnicalInterviewService {

	@Autowired
	TechnicalInterviewDao technicalInterviewDao;
	
	public void setTechnicalInterviewDao(TechnicalInterviewDao technicalInterviewDao) {
		this.technicalInterviewDao = technicalInterviewDao;
	}

	public void scheduleTechnicalInterview(TechnicalInterview t) {
		technicalInterviewDao.scheduleTechnicalInterview(t);
	}

	public TechnicalInterview getTechnicalInterviewById(int tech_i_id) {
		return technicalInterviewDao.getTechnicalInterviewById(tech_i_id);
	}

	public List<TechnicalInterview> getAllTechnicalInterview() {
		return technicalInterviewDao.getAllTechnicalInterview();
	}

	@Override
	public void updateTechnicalinterview(TechnicalInterview technicalInterview) {
		technicalInterviewDao.updateTechnicalinterview(technicalInterview);
	}

	@Override
	public List<TechnicalInterview> getTechnicalInterviewByStatus(String tech_status) {
		return technicalInterviewDao.getTechnicalInterviewByStatus(tech_status);
	}

}
