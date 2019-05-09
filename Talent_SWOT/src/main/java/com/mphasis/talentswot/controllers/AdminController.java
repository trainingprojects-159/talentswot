package com.mphasis.talentswot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mphasis.talentswot.daos.CandidateDao;
import com.mphasis.talentswot.entities.Admin;
import com.mphasis.talentswot.services.AdminService;

@Controller
public class AdminController {
	@Autowired
	AdminService adminService;

	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
	
	
	@RequestMapping(value="/admin",method=RequestMethod.GET)
	public Admin login(String a_id, String pass) {
	
	return this.adminService.login(a_id,pass);
	

}
	@Autowired
CandidateService candidateService;
	
	
	public void setCandidateService(CandidateService candidateService) {
		this.candidateService = candidateService;
	}


	@RequestMapping(value="/admin/add",method=RequestMethod.Post)
	public void addCandidate(@Re)
	
	
	
}
