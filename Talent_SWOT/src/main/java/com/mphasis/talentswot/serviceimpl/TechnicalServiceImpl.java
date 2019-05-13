package com.mphasis.talentswot.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mphasis.talentswot.daos.TechnicalDao;
import com.mphasis.talentswot.entities.Technical;
import com.mphasis.talentswot.exceptions.BuissnessException;
import com.mphasis.talentswot.services.TechnicalService;

@Service
public class TechnicalServiceImpl implements TechnicalService {

	@Autowired
	TechnicalDao technicalDao;
	
	
	public void setTechnicalDao(TechnicalDao technicalDao) {
		this.technicalDao = technicalDao;
	}


	public Technical check(String email, String password) throws BuissnessException {
		
		return technicalDao.login(email, password);
	}


	

}
