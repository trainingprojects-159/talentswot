package com.mphasis.talentswot.daos;

import com.mphasis.talentswot.entities.Admin;

public interface AdminDao {
	public Admin login(String a_id, String pass);

}
