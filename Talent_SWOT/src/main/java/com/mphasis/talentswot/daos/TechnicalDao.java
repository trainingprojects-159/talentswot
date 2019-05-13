package com.mphasis.talentswot.daos;

import com.mphasis.talentswot.entities.Technical;
import com.mphasis.talentswot.exceptions.BuissnessException;

public interface TechnicalDao {
	public Technical login(String email, String password) throws BuissnessException;
}
