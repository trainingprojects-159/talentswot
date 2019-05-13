package com.mphasis.talentswot.daos;

import com.mphasis.talentswot.entities.Admin;
import com.mphasis.talentswot.exceptions.BuissnessException;

public interface AdminDao {
	public Admin login(String a_id, String pass) throws BuissnessException;

}
