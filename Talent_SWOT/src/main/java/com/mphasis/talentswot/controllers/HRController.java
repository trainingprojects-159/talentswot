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
import com.mphasis.talentswot.entities.FinalStatus;
import com.mphasis.talentswot.entities.HR;
import com.mphasis.talentswot.entities.HRInterview;
import com.mphasis.talentswot.services.FinalStatusService;
import com.mphasis.talentswot.services.HRInterviewService;
import com.mphasis.talentswot.services.HRService;
import com.mphasis.talentswot.services.TechnicalInterviewService;

@RestController
@RequestMapping("/hr")
public class HRController {

	@Autowired
	HRService hrService;
	
	@Autowired
	HRInterviewService hrInterviewService;
	
	@Autowired
	TechnicalInterviewService technicalInterviewService;
	
	@Autowired
	FinalStatusService finalStatusService;
	
	

	public void setTechnicalInterviewService(TechnicalInterviewService technicalInterviewService) {
		this.technicalInterviewService = technicalInterviewService;
	}

	public void setHrService(HRService hrService) {
		this.hrService = hrService;
	}

	public void setHrInterviewService(HRInterviewService hrInterviewService) {
		this.hrInterviewService = hrInterviewService;
	}
	
	@RequestMapping(value="/login/{hr_id}/{pass}", method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public HR login(@PathVariable("hr_id")String hr_id,@PathVariable("pass")String pass) {
		HR hr = hrService.login(hr_id, pass);
		return hr;
	}
	
	@RequestMapping(value="hr/technical/{tech_status}", method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public void getTechnicalInterviewByStatus(@PathVariable("tech_status")String tech_status) {
		this.technicalInterviewService.getTechnicalInterviewByStatus(tech_status);
	}
	
	@RequestMapping(value="/hr", method=RequestMethod.PUT,produces=MediaType.APPLICATION_JSON_VALUE)
	public void updateHRinterview(@RequestBody HRInterview hrInterview ) {
		this.hrInterviewService.updateHRinterview(hrInterview);
	}
	
	@RequestMapping(value="/hr/add", method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
	public void addFinalStatus(@RequestBody FinalStatus finalStatus ) {
		this.finalStatusService.addFinalStatus(finalStatus);
	}
	
	@RequestMapping(value="/finalstatus", method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<FinalStatus> ListFinalStatus() {
		return this.finalStatusService.getAllFinalStatus();
	}
}
