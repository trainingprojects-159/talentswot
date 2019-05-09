package com.mphasis.talentswot.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.talentswot.daos.HRDao;
import com.mphasis.talentswot.entities.HR;
import com.mphasis.talentswot.services.HRService;

@Service

public class HRServiceImpl implements HRService{
	@Autowired
	HRDao hRDao;

	public void sethRDao(HRDao hRDao) {
		this.hRDao = hRDao;
	}

	public HR login(String hr_id, String pass) {
		return hRDao.login(hr_id, pass);
	}

}
