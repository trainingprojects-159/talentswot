package com.mphasis.talentswot.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.talentswot.daos.HRInterviewDao;
import com.mphasis.talentswot.entities.HRInterview;
import com.mphasis.talentswot.services.HRInterviewService;


@Service

public class HRInterviewServiceImpl implements HRInterviewService {
	@Autowired
	HRInterviewDao hRInterviewDao;

	public void sethRInterviewDao(HRInterviewDao hRInterviewDao) {
		this.hRInterviewDao = hRInterviewDao;
	}

	public void scheduleHRInterview(HRInterview h) {
		hRInterviewDao.scheduleHRInterview(h);

		
	}

	public HRInterview getHRInterviewById(int hr_i_id) {
		return hRInterviewDao.getHRInterviewById(hr_i_id);
	}

	public List<HRInterview> getAllHRInterview() {
		return hRInterviewDao.getAllHRInterview();
	}

	@Override
	public void updateHRinterview(HRInterview hrInterview) {
		hRInterviewDao.updateHRinterview(hrInterview);
	}

	

	

}
