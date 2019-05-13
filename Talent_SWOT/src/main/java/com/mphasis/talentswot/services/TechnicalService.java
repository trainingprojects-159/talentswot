package com.mphasis.talentswot.services;

import com.mphasis.talentswot.entities.Technical;
import com.mphasis.talentswot.exceptions.BuissnessException;

public interface TechnicalService {

	public Technical check(String email, String password) throws BuissnessException;
}
