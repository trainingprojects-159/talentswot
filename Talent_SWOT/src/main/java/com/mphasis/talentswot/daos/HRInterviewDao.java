package com.mphasis.talentswot.daos;

import java.util.List;

import com.mphasis.talentswot.entities.HRInterview;
import com.mphasis.talentswot.exceptions.BuissnessException;

public interface HRInterviewDao {
	public void scheduleHRInterview(HRInterview h) throws BuissnessException;
	public void updateHRinterview(HRInterview hrInterview) throws BuissnessException;
	public HRInterview getHRInterviewById(int hr_i_id) throws BuissnessException;
	public List<HRInterview> getAllHRInterview() throws BuissnessException;
}
