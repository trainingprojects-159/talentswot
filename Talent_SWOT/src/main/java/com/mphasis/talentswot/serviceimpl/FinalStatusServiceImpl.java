package com.mphasis.talentswot.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.talentswot.daos.FinalStatusDao;
import com.mphasis.talentswot.entities.FinalStatus;

import com.mphasis.talentswot.exceptions.BuissnessException;
import com.mphasis.talentswot.services.FinalStatusService;


@Service
public class FinalStatusServiceImpl implements FinalStatusService{
	
	@Autowired
	FinalStatusDao finalStatusDao;
	
	public void setFinalStatusDao(FinalStatusDao finalStatusDao) {
		this.finalStatusDao = finalStatusDao;
	}

	
	public void addFinalStatus(FinalStatus fs) throws BuissnessException {
		finalStatusDao.addFinalStatus(fs);
		
	}


	public List<FinalStatus> getFinalStatusBystatus(String Status) throws BuissnessException {
		
		return finalStatusDao.getFinalStatusBystatus(Status);
	}


	public List<FinalStatus> getAllFinalStatus() throws BuissnessException {
		
		return finalStatusDao.getAllFinalStatus();
	}
	}


