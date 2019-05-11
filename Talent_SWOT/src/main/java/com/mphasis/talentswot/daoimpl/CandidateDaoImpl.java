package com.mphasis.talentswot.daoimpl;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mphasis.talentswot.daos.CandidateDao;
import com.mphasis.talentswot.entities.Candidate;
@Repository
public class CandidateDaoImpl implements CandidateDao {
	
	@Autowired
	SessionFactory sessionFactory;



	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addCandidate(Candidate candidate) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		session.save(candidate);
		tr.commit();

	}

		public void deleteCandidate(String c_id) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		Candidate c=(Candidate)session.get(Candidate.class,c_id);
		session.delete(c);
		tr.commit();

	}

	public void updateCandidate(Candidate candidate) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();	
		session.update(candidate);
		tr.commit();
		

	}

	public Candidate getCandidateById(String c_id) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		Candidate c=(Candidate)session.get(Candidate.class,c_id);
		tr.commit();
		return c;
		
		
	}

	public List<Candidate> getAllCandidate() {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		List<Candidate> candidates = session.createQuery("from Candiate",Candidate.class).list();
		tr.commit();
		return candidates;
		
	}


	




}