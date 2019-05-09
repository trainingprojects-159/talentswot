package com.mphasis.talentswot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mphasis.talentswot.entities.Technical;
import com.mphasis.talentswot.services.TechnicalInterviewService;
import com.mphasis.talentswot.services.TechnicalService;

@RestController
public class TechnicalController {

	@Autowired
	TechnicalService technicalService;
	
	@Autowired
	TechnicalInterviewService technicalInterviewService;
	
	

	public void setTechnicalInterviewService(TechnicalInterviewService technicalInterviewService) {
		this.technicalInterviewService = technicalInterviewService;
	}

	public void setTechnicalService(TechnicalService technicalService) {
		this.technicalService = technicalService;
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public Technical login(@RequestParam("tech_id")String name,@RequestParam("pass")String pass) {
		Technical technical = technicalService.check(name, pass);
		return technical;
	}
	
	
	
	
}
