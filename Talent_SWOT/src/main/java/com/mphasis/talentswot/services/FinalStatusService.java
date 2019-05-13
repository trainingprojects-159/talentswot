package com.mphasis.talentswot.services;

import java.util.List;

import com.mphasis.talentswot.entities.Admin;
import com.mphasis.talentswot.entities.FinalStatus;
import com.mphasis.talentswot.exceptions.BuissnessException;

public interface FinalStatusService {

	public void addFinalStatus(FinalStatus fs) throws BuissnessException;
	public List<FinalStatus> getFinalStatusBystatus(String Status) throws BuissnessException;
	public List<FinalStatus> getAllFinalStatus() throws BuissnessException;
}

