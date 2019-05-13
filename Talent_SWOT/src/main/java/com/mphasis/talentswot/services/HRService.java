package com.mphasis.talentswot.services;

import com.mphasis.talentswot.entities.HR;
import com.mphasis.talentswot.exceptions.BuissnessException;

public interface HRService {
	public HR login(String hr_id, String pass) throws BuissnessException;

}
