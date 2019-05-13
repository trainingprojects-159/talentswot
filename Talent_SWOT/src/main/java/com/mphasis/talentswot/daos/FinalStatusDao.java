package com.mphasis.talentswot.daos;

import java.util.List;

import com.mphasis.talentswot.entities.FinalStatus;
import com.mphasis.talentswot.exceptions.BuissnessException;

public interface FinalStatusDao {
	
	public void addFinalStatus(FinalStatus fs) throws BuissnessException;
	public List<FinalStatus> getFinalStatusBystatus(String Status) throws BuissnessException;
	public List<FinalStatus> getAllFinalStatus() throws BuissnessException;
	
	}

