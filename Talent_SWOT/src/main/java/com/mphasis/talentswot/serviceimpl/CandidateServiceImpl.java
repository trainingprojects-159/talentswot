package com.mphasis.talentswot.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.mphasis.talentswot.daos.CandidateDao;
import com.mphasis.talentswot.entities.Candidate;
import com.mphasis.talentswot.exceptions.BuissnessException;
import com.mphasis.talentswot.services.CandidateService;

@Service
public class CandidateServiceImpl implements CandidateService {
	
	@Autowired
	CandidateDao candidateDao;

	public void addCandidate(Candidate c) throws BuissnessException {
		candidateDao.addCandidate(c);
	}

	public void deleteCandidate(String c_id) throws BuissnessException {
		candidateDao.deleteCandidate(c_id);
	}

	public void updateCandidate(Candidate candidate) throws BuissnessException {
		candidateDao.updateCandidate(candidate);
	}

	public Candidate getCandidateById(String c_id) throws BuissnessException {
		return candidateDao.getCandidateById(c_id) ;
	}

	public List<Candidate> getAllCandidate() throws BuissnessException {
		return candidateDao.getAllCandidate();
	}

	
	

	

	

}
