package com.mphasis.talentswot.daos;

import java.util.List;

import com.mphasis.talentswot.entities.HRInterview;

public interface HRInterviewDao {
	public void scheduleHRInterview(HRInterview h);
	public HRInterview getHRInterviewById(int hr_i_id);
	public List<HRInterview> getAllHRCandidates();
}
