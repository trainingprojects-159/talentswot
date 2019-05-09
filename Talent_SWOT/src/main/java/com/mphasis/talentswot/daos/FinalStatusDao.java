package com.mphasis.talentswot.daos;

import java.util.List;

import com.mphasis.talentswot.entities.FinalStatus;

public interface FinalStatusDao {
	
	public void addFinalStatus(FinalStatus f);
	public FinalStatus getFinalStatusById(int s_id);
	public List<FinalStatus> getAllFinalStatus();
}
