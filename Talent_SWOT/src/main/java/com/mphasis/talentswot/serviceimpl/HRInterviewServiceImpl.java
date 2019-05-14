package com.mphasis.talentswot.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.talentswot.daos.HRInterviewDao;
import com.mphasis.talentswot.entities.HRInterview;
import com.mphasis.talentswot.exceptions.BuissnessException;
import com.mphasis.talentswot.services.HRInterviewService;


@Service

public class HRInterviewServiceImpl implements HRInterviewService {
	@Autowired
	HRInterviewDao hRInterviewDao;

	public void sethRInterviewDao(HRInterviewDao hRInterviewDao) throws BuissnessException {
		this.hRInterviewDao = hRInterviewDao;
	}

	public void scheduleHRInterview(HRInterview h) throws BuissnessException{
		hRInterviewDao.scheduleHRInterview(h);

		
	}

	public HRInterview getHRInterviewById(int hr_i_id) throws BuissnessException {
		return hRInterviewDao.getHRInterviewById(hr_i_id);
	}

	public List<HRInterview> getAllHRInterview() throws BuissnessException {
		return hRInterviewDao.getAllHRInterview();
	}

	@Override
	public void updateHRinterview(HRInterview hrInterview) throws BuissnessException {
		hRInterviewDao.updateHRinterview(hrInterview);
	}

	

	

}
