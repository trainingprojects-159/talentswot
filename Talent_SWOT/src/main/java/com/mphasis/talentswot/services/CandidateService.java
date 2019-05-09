package com.mphasis.talentswot.services;

import java.util.List;

import com.mphasis.talentswot.entities.Candidate;

public interface CandidateService {
	public void insertCandidate(Candidate candidate);
	public void deleteCandidate(String c_id);
	public void updateCandidate(Candidate candidate);
	public Candidate getById(String c_id);
	public List<Candidate> getAllCandidates();
	public List<Candidate> getCandidateByStatus(String status);
}