package com.mphasis.talentswot.services;

import java.util.List;

import com.mphasis.talentswot.entities.HRInterview;

public interface HRInterviewService {
	public void scheduleHRInterview(HRInterview h);
	public HRInterview getHRInterviewById(int hr_i_id);
	public List<HRInterview> getAllCandidates();
}
