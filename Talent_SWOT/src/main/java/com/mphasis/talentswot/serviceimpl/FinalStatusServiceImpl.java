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



	public List<FinalStatus> getAll() {
			return finalStatusDao.getAll();
		}

	}


