package com.mphasis.talentswot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.mphasis.talentswot.entities.Candidate;
import com.mphasis.talentswot.entities.Technical;
import com.mphasis.talentswot.entities.TechnicalInterview;
import com.mphasis.talentswot.services.CandidateService;
import com.mphasis.talentswot.services.TechnicalInterviewService;
import com.mphasis.talentswot.services.TechnicalService;


@RestController
@RequestMapping("/technical")
public class TechnicalController {

	@Autowired
	TechnicalService technicalService;
	
	@Autowired
	TechnicalInterviewService technicalInterviewService;
	
	@Autowired
	CandidateService candidateService;
	

	public void setCandidateService(CandidateService candidateService) {
		this.candidateService = candidateService;
	}

	public void setTechnicalInterviewService(TechnicalInterviewService technicalInterviewService) {
		this.technicalInterviewService = technicalInterviewService;
	}

	public void setTechnicalService(TechnicalService technicalService) {
		this.technicalService = technicalService;
	}
	
	@RequestMapping(value="/login/{tech_id}/{pass}", method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public Technical login(@PathVariable("tech_id")String name,@PathVariable("pass")String pass) {
		Technical technical = technicalService.check(name, pass);
		return technical;
	}
	
	@RequestMapping(value="/candidates", method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Candidate> ListCandidate() {
		return this.candidateService.getAllCandidate();
	}
	
	
	@RequestMapping(value="/technicalInterview", method=RequestMethod.PUT,produces=MediaType.APPLICATION_JSON_VALUE)
	public void updateTechnicalinterview(@RequestBody TechnicalInterview technicalInterview ) {
		this.technicalInterviewService.updateTechnicalinterview(technicalInterview);
	}
	
	@RequestMapping(value="/technical/{tech_status}", method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<TechnicalInterview> getTechnicalInterviewByStatus(@PathVariable("tech_status")String tech_status) {
		return this.technicalInterviewService.getTechnicalInterviewByStatus(tech_status);
	}
	
}
