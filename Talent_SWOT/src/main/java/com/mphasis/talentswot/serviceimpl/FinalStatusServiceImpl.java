package com.mphasis.talentswot.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.talentswot.daos.FinalStatusDao;
import com.mphasis.talentswot.entities.FinalStatus;

@Service
public class FinalStatusServiceImpl implements FinalStatusDao{
	@Autowired
	FinalStatusDao finalStatusDao;
	
	public void setFinalStatusDao(FinalStatusDao finalStatusDao) {
		this.finalStatusDao = finalStatusDao;
	}

	@Override
	public void addFinalStatus(FinalStatus fs) {
		finalStatusDao.addFinalStatus(fs);
		
	}

	@Override
	public List<FinalStatus> getFinalStatusBystatus(String Status) {
		
		return finalStatusDao.getFinalStatusBystatus(Status);
	}

	@Override
	public List<FinalStatus> getAllFinalStatus() {
		
		return finalStatusDao.getAllFinalStatus();
	}



	

	}


