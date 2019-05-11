
	package com.mphasis.talentswot.serviceimpl;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	import com.mphasis.talentswot.daos.AdminDao;
	import com.mphasis.talentswot.entities.Admin;
	import com.mphasis.talentswot.services.AdminService;

	@Service
	public class AdminServiceImpl  implements AdminService{
		@Autowired
		AdminDao adminDao;

		public void setAdminDao(AdminDao adminDao) {
			this.adminDao = adminDao;
		}

		public Admin login(String a_id, String pass) {
			
			return adminDao.login(a_id, pass);
			
		}
		
	}


