package com.mphasis.talentswot.daos;

import java.util.List;

import com.mphasis.talentswot.entities.Candidate;

public interface CandidateDao {
	public void addCandidate(Candidate c);
	public void deleteCandidate(int c_id);
	public void updateCandidate(Candidate candidate);
	public Candidate getCandidateById(int c_id);
	public List<Candidate> getAllCandidate();
	public List<Candidate> getCandidateByStatus(String status);
}
