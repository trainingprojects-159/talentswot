package com.mphasis.talentswot.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mphasis.talentswot.daos.TechnicalInterviewDao;
import com.mphasis.talentswot.entities.TechnicalInterview;

@Repository
@Transactional
public class TechnicalInterviewDaoImpl implements TechnicalInterviewDao {

	@Autowired
	SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void scheduleTechnicalInterview(TechnicalInterview t) {
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(t);
		transaction.commit();

	}

	public TechnicalInterview getTechnicalInterviewById(int tech_i_id) {
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		TechnicalInterview techid=(TechnicalInterview) session.get(TechnicalInterview.class, tech_i_id);
		transaction.commit();
		return techid;

	}

	public List<TechnicalInterview> getAllTechnicalInterview() {
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		List<TechnicalInterview> tech = session.createCriteria(TechnicalInterview.class).list();
		transaction.commit();
		return tech;

	}

}
