package com.mphasis.talentswot.daos;

import com.mphasis.talentswot.entities.HR;
import com.mphasis.talentswot.exceptions.BuissnessException;

public interface HRDao {
	public HR login(String hr_id, String pass) throws BuissnessException;
}
