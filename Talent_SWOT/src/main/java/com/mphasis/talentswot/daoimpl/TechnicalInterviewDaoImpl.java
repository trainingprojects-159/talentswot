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

import com.mphasis.talentswot.daos.TechnicalInterviewDao;
import com.mphasis.talentswot.entities.TechnicalInterview;
import com.mphasis.talentswot.exceptions.BuissnessException;

@Repository
public class TechnicalInterviewDaoImpl implements TechnicalInterviewDao {

	@Autowired
	SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void scheduleTechnicalInterview(TechnicalInterview t) throws BuissnessException {
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(t);
		transaction.commit();

	}

	public TechnicalInterview getTechnicalInterviewById(int tech_i_id) throws BuissnessException {
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		TechnicalInterview techid=(TechnicalInterview) session.get(TechnicalInterview.class, tech_i_id);
		transaction.commit();
		return techid;

	}

	public List<TechnicalInterview> getAllTechnicalInterview() throws BuissnessException {
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		List<TechnicalInterview> tech = session.createQuery("from TechnicalInterview",TechnicalInterview.class).list();
		transaction.commit();
		return tech;

	}


	public void updateTechnicalinterview(TechnicalInterview technicalInterview) throws BuissnessException {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();	
		session.update(technicalInterview);
		tr.commit();
		
	}


	public List<TechnicalInterview> getTechnicalInterviewByStatus(String tech_status) throws BuissnessException {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		List<TechnicalInterview> technicalInterview = session.createNativeQuery("select * from TechnicalInterview where tech_Status=:tech_status").list();
		transaction.commit();
		return technicalInterview;
	}

	

}
