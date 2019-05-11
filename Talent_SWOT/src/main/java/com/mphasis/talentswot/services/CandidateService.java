package com.mphasis.talentswot.services;

import java.util.List;

import com.mphasis.talentswot.entities.Candidate;

public interface CandidateService {
	public void addCandidate(Candidate c);
	public void deleteCandidate(String c_id);
	public void updateCandidate(Candidate candidate);
	public Candidate getCandidateById(String c_id);
	public List<Candidate> getAllCandidate();
	
}