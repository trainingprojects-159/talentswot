package com.mphasis.talentswot.daoimpl;

import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mphasis.talentswot.daos.TechnicalDao;
import com.mphasis.talentswot.entities.Technical;
import com.mphasis.talentswot.exceptions.BuissnessException;

@Repository

public class TechnicalDaoImpl implements TechnicalDao {

	@Autowired
	SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Technical login(String tech_id, String pass) throws BuissnessException {
		
		Session session = sessionFactory.openSession();
		TypedQuery<Technical> query=session.createQuery("from Technical where tech_id=:tech_id and pass=:pass");
		query.setParameter("tech_id", tech_id);
		query.setParameter("pass", pass);
		Technical tech = (Technical) query.getSingleResult();
		return tech;
		
	}

}
