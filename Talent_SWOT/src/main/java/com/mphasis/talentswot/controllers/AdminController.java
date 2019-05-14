package com.mphasis.talentswot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mphasis.talentswot.entities.Admin;
import com.mphasis.talentswot.entities.Candidate;
import com.mphasis.talentswot.entities.FinalStatus;
import com.mphasis.talentswot.entities.HRInterview;
import com.mphasis.talentswot.entities.TechnicalInterview;
import com.mphasis.talentswot.exceptions.BuissnessException;
import com.mphasis.talentswot.services.AdminService;
import com.mphasis.talentswot.services.CandidateService;
import com.mphasis.talentswot.services.FinalStatusService;
import com.mphasis.talentswot.services.HRInterviewService;
import com.mphasis.talentswot.services.TechnicalInterviewService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	AdminService adminService;
		
	@Autowired
	CandidateService candidateService;
	
	@Autowired
	TechnicalInterviewService technicalInterviewService;
	
	@Autowired
	HRInterviewService hrInterviewService;
	
	@Autowired
	FinalStatusService finalStatusService;
	
	public void setHrInterviewService(HRInterviewService hrInterviewService) throws BuissnessException {
		this.hrInterviewService = hrInterviewService;
	}



	public void setAdminService(AdminService adminService) throws BuissnessException {
		this.adminService = adminService;
	}
	
	

	public void setCandidateService(CandidateService candidateService) throws BuissnessException {
		this.candidateService = candidateService;
	}



	public void setTechnicalInterviewService(TechnicalInterviewService technicalInterviewService) throws BuissnessException {
		this.technicalInterviewService = technicalInterviewService;
	}

	
	public void setFinalStatusService(FinalStatusService finalStatusService) {
		this.finalStatusService = finalStatusService;
	}



	@RequestMapping(value="/login/{a_id}/{pass}", method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE) 
	public Admin login(@PathVariable("a_id")String a_id,@PathVariable("pass")String pass) throws BuissnessException {
		Admin admin = adminService.login(a_id, pass);
		return admin;
	}	
	
	@RequestMapping(value="/candidate/add",method=RequestMethod.POST)
	public void addCandidate(@RequestBody Candidate c) throws BuissnessException {

		this.candidateService.addCandidate(c);
	}
	
	@RequestMapping(value="/candidate/{c_id}",method=RequestMethod.DELETE)
	public void deleteCandidate(@PathVariable("c_id")String c_id) throws BuissnessException {

		this.candidateService.deleteCandidate(c_id);
	}

	@RequestMapping(value="/candidate/{c_id}",method=RequestMethod.PUT)
	public void updateCandidate(@PathVariable("c_id")int c_id,@RequestBody Candidate candidate) throws BuissnessException {

		this.candidateService.updateCandidate(candidate);
	}
	
	@RequestMapping(value="/candidate/{c_id}",method=RequestMethod.GET)
	public Candidate getCandidateById(@PathVariable("c_id")String c_id) throws BuissnessException {
	return this.candidateService.getCandidateById(c_id);
	}
	
	@RequestMapping(value="/candidate",method=RequestMethod.GET)
	public List<Candidate> listCandidates() throws BuissnessException {
		return candidateService.getAllCandidate();
	}
	
	
	@RequestMapping(value="/technical/add", method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
	public void scheduleTechnicalInterview(@RequestBody TechnicalInterview t ) throws BuissnessException {
		this.technicalInterviewService.scheduleTechnicalInterview(t);
	}
	
	
	@RequestMapping(value="/hr/add", method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
	public void scheduleHRInterview(@RequestBody HRInterview h ) throws BuissnessException {
		this.hrInterviewService.scheduleHRInterview(h);
	}
	
	@RequestMapping(value="/finalstatus/add", method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
	public void addFinalStatus(@RequestBody FinalStatus fs ) throws BuissnessException {
		this.finalStatusService.addFinalStatus(fs);
	}
	

	@RequestMapping(value="/final",method=RequestMethod.GET)
	public List<FinalStatus> getAllFinalStatus() throws BuissnessException{
		return finalStatusService.getAllFinalStatus();
	}
	
	@RequestMapping(value="/finalstatus/{Status}",method=RequestMethod.GET)
	public List<FinalStatus> getFinalStatusBystatus(@PathVariable("Status")String Status) throws BuissnessException {
	return this.finalStatusService.getFinalStatusBystatus(Status);
	}
	
}
