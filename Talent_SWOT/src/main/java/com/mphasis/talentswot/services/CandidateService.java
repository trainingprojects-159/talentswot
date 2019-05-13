package com.mphasis.talentswot.services;

import java.util.List;

import com.mphasis.talentswot.entities.Candidate;
import com.mphasis.talentswot.exceptions.BuissnessException;

public interface CandidateService {
	public void addCandidate(Candidate c) throws BuissnessException;
	public void deleteCandidate(String c_id) throws BuissnessException;
	public void updateCandidate(Candidate candidate) throws BuissnessException;
	public Candidate getCandidateById(String c_id) throws BuissnessException;
	public List<Candidate> getAllCandidate() throws BuissnessException;
	
}