package com.mphasis.talentswot.services;

import java.util.List;

import com.mphasis.talentswot.entities.Admin;
import com.mphasis.talentswot.entities.FinalStatus;

public interface FinalStatusService {

	public void addFinalStatus(FinalStatus fs);
	public List<FinalStatus> getFinalStatusBystatus(String Status);
	public List<FinalStatus> getAllFinalStatus();
}

