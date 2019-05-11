package com.mphasis.talentswot.services;

import java.util.List;

import com.mphasis.talentswot.entities.HRInterview;
import com.mphasis.talentswot.entities.TechnicalInterview;

public interface HRInterviewService {
	public void scheduleHRInterview(HRInterview h);
	public void updateHRinterview(HRInterview hrInterview);
	public HRInterview getHRInterviewById(int hr_i_id);
	public List<HRInterview> getAllHRInterview();
}
