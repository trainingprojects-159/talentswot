package com.mphasis.talentswot.daos;

import com.mphasis.talentswot.entities.HR;

public interface HRDao {
	public HR login(String hr_id, String pass);
}
