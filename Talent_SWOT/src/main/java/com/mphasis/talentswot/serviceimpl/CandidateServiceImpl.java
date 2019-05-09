package com.mphasis.talentswot.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.mphasis.talentswot.daos.CandidateDao;
import com.mphasis.talentswot.entities.Candidate;
import com.mphasis.talentswot.services.CandidateService;

@Service
public class CandidateServiceImpl implements CandidateService {
	
	@Autowired
	CandidateDao candidateDao;
	
	

	public void setCandidateDao(CandidateDao candidateDao) {
		this.candidateDao = candidateDao;
	}

	public void insertCandidate(Candidate candidate) {
		// TODO Auto-generated method stub
		candidateDao.insertCandidate(candidate);
		
	}

	public void deleteCandidate(String c_id) {
		// TODO Auto-generated method stub
		candidateDao.deleteCandidate(c_id);
		
	}

	public void updateCandidate(Candidate candidate) {
		// TODO Auto-generated method stub
		candidateDao.updateCandidate(candidate);
	}

	public Candidate getById(String c_id) {
		// TODO Auto-generated method stub
		return  candidateDao.getById(c_id);
	}

	public List<Candidate> getAllCandidates() {
		// TODO Auto-generated method stub
		return candidateDao.getAllCandidates();
	}

	public List<Candidate> getCandidateByStatus(String status) {
		// TODO Auto-generated method stub
		return candidateDao.getCandidateByStatus(status);
	}
	

	

}
