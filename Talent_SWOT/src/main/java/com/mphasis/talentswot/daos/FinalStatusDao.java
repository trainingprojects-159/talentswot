package com.mphasis.talentswot.daos;

import java.util.List;

import com.mphasis.talentswot.entities.FinalStatus;

public interface FinalStatusDao {
	
	public void addFinalStatus(FinalStatus fs);
	public FinalStatus getFinalStatusBystatus(String Status);
	public List<FinalStatus> getAllFinalStatus();
	
	}

