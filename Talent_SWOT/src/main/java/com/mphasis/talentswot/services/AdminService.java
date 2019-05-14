package com.mphasis.talentswot.services;


import com.mphasis.talentswot.entities.Admin;
import com.mphasis.talentswot.exceptions.BuissnessException;

public interface AdminService {
	public Admin login(String a_id, String pass) throws BuissnessException;


}

