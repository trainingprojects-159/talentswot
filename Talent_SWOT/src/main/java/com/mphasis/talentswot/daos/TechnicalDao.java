package com.mphasis.talentswot.daos;

import com.mphasis.talentswot.entities.Technical;

public interface TechnicalDao {
	public Technical login(String email, String password);
}
