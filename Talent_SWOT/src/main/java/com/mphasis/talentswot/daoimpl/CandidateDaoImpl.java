package com.mphasis.talentswot.daoimpl;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mphasis.talentswot.daos.CandidateDao;
import com.mphasis.talentswot.entities.Candidate;
@Repository
@Transactional
public class CandidateDaoImpl implements CandidateDao {
	
	@Autowired
	SessionFactory sessionFactory;



	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void insertCandidate(Candidate candidate) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		System.out.println(candidate.getC_id()+"candidate value in dao");
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

	public Candidate getById(String c_id) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		Candidate c=(Candidate)session.get(Candidate.class,c_id);
		tr.commit();
		return c;
		
		
	}

	public List<Candidate> getCandidates() {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		List<Candidate> candidates=session.createCriteria(Candidate.class).list();
		tr.commit();
		return candidates;
		
	}



	public List<Candidate> getAllCandidates() {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		List<Candidate> candidates=session.createCriteria(Candidate.class).list();
		tr.commit();
		return candidates;
	}

	public List<Candidate> getCandidateByStatus(String status) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		Criteria cri=session.createCriteria(Candidate.class);
		cri.add(Restrictions.eq("model", status));
		List<Candidate> candidates=cri.list();
		return candidates;
	}

}